import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import twitter4j.HashtagEntity;
import twitter4j.Status;

public class DataReader {

	static String tweetPath = "data/from_top_bin/election/785613479684153345.top";
	
	public static Status readTweet(File f) throws ClassNotFoundException, IOException{
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream read = new ObjectInputStream(fis);
		Status status = (Status) read.readObject();
		read.close();
		return status;
	}

	/*
	public static ArrayList<Article> readArticle(File f) throws ClassNotFoundException, IOException{
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream read = new ObjectInputStream(fis);
		ArrayList<Article> docs = (ArrayList<Article>) read.readObject();
		read.close();
		return docs;
	}*/

	public static void readTweetTest(String path) throws IOException, ClassNotFoundException{
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream read = new ObjectInputStream(fis);
		Status status = (Status) read.readObject();
		System.out.println(status.getId());
		System.out.println(status.getText());
		System.out.println(status.getRetweetCount());
		for (HashtagEntity e : status.getHashtagEntities())
			System.out.println("hashtag:=" + e.getText());
		System.out.println(status.getLang());
		System.out.println(status.getCreatedAt().toString());
		read.close();
	}

	/*
	public static List<Tweet> readAllTweet(File[] files) throws ClassNotFoundException, IOException{
		List<Tweet> data = new ArrayList<>();
		Status status = null;
		int count = 0;
		for (int i = 0; i<files.length; i++){
			status = DataReader.readTweet(files[i]);
			String lang = status.getLang();
			if (lang.equals("en")){
				long tweetID = status.getId();
				//System.out.println("Original tweet:=" + status.getText());
				String text = DataCleaning.removeLink(status.getText());
				//System.out.println("Removing HTTP tweet:=" + text);
				Date createdAt = status.getCreatedAt();
				//System.out.println("Created at:=" + createdAt.toString());
				int rt = status.getRetweetCount();
				//System.out.println("Retweet count:=" + rt);
				//System.out.println("---------------------------------------");
				count ++;
				
				Tweet tweet = new Tweet();
				tweet.setTweetID(tweetID);
				tweet.setText(text);
				tweet.setReTweet(rt);
				tweet.setTime(createdAt);
				data.add(tweet);
			}
		}
		System.out.println("The number of English tweets:=" + count);
		return data;
	}*/

	/*
	public static List<Article> readAllArticle(File[] files) throws ClassNotFoundException, IOException{
		List<Article> data = new ArrayList<>();
		List<Article> status = null;
		int count = 0;
		for (int i = 0; i<files.length; i++){
			status = DataReader.readArticle(files[i]);
			for (Article a : status){
				String title = a.getTitle();
				String time = a.getTime();
				List<String> highlight = a.getHighlight();
				List<String> content = a.getContent();
				String news = a.getNews();
			}
		}
		System.out.println("The number of English tweets:=" + count);
		return data;
	}*/
	public static void main(String[] args) throws ClassNotFoundException, IOException{
		String path = "data/from_news_bin/brexit";
		File folder = new File(path);
		File[] files = folder.listFiles();
		Status status = null;
		int count = 0;
		for (int i = 0; i<100; i++){
			status = DataReader.readTweet(files[i]);
			String lang = status.getLang();
			if (lang.equals("en")){
				System.out.println("Original tweet:=" + status.getText());
				String tweet = status.getText();
				System.out.println("Removing HTTP tweet:=" + DataCleaning.removeLink(tweet));
				System.out.println(status.getCreatedAt().toString());
				count ++;
			}
			//System.out.println(status.getId());
			//System.out.println(status.getText());
			//System.out.println(status.getRetweetCount());
			//for (HashtagEntity e : status.getHashtagEntities())
				//System.out.println("hashtag:=" + e.getText());
			
			//System.out.println(status.getLang());
			//System.out.println(status.getCreatedAt().toString());
		}
		System.out.println(count);
	}
}
