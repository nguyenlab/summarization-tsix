# TSix: A tweet-event summarization dataset

This is a social event summarization dataset. We crawled tweets related to 6
events from Twitter using Twitter public API. The data is collected in 26
continuous days. We provided the the clustered version of raw data with its
two references: the machine-annotated set based on hashtag and the manually
annotated set created by two annotatators.

Tweet data is divided by event, published date and cluster.


## Directories

The data is organized as follow:
  - from_top_bin_raw_data: the raw data collected from Twitter. You can use the DataReader.java file to read the data and do the cluster as the description in the paper. See section `Reading raw data` below for detailed instructions.
  - data-cluster: Each event is clustered into multiple subtopics by Affinity Propagation.
  - reference-hashtag: An automatic reference of data-cluster using hashtag.
  					 File name pattern: "sum.<day>.<cluster>.<annotator>.txt"
  - reference-votting: An human-annotated reference created by two annotators.
  					 File name pattern: "sum.<day>.<cluster>.<annotator>.txt"

## Reading raw data
If you need more information than the text content of the posts such as Retweet Count (see class **Status** at [Twitter4J API](http://twitter4j.org/javadoc/index.html) for all available fields ), you need to read from raw data file.
1. Go to `DataReader.java` **line 123 and 124** to configure `path` (the folder to the raw data of the topic you interested) and `outPath` (the path to save the extracted information).
2. Further down in main() **line 143 onwards**, you can choose the fields from Status class that you are interested in.
Compile and run with the included [Twitter4J v4.0.4 library](http://twitter4j.org/archive/twitter4j-4.0.4.zip) (the later versions do not work as they changed the class signature):
```
javac -cp ".:./t4j-4.0.4.jar" DataReader.java
java -cp ".:./t4j-4.0.4.jar" DataReader
```
By default, the output file separates each Tweet status with a `\t` delimiter and useus a `|||` delimiter among fields of a single Tweet status. It has been validated that these 2 delimiter do not appear in the raw data as field content.

## Contributing

Please create an issue at https://github.com/nguyenlab/summarization-tsix reposiroty.
We encourage people to contribute to this repository and apply in practical
application.

## License & co


* The code in this repository is released under the terms of the
  [MIT license](LICENSE.txt).
* If you use our data, please cite our following paper and share your idea by email :
```
@InProceedings{NGUYEN18.516,
  author = {Minh-Tien Nguyen ,Dac Viet Lai ,Huy-Tien Nguyen and Minh-Le Nguyen},
  title = {TSix: A Human-involved-creation Dataset for Tweet Summarization},
  booktitle = {Proceedings of the Eleventh International Conference on Language Resources and Evaluation (LREC 2018)},
  year = {2018},
  month = {may},
  date = {7-12},
  location = {Miyazaki, Japan},
  editor = {Nicoletta Calzolari (Conference chair) and Khalid Choukri and Christopher Cieri and Thierry Declerck and Sara Goggi and Koiti Hasida and Hitoshi Isahara and Bente Maegaard and Joseph Mariani and Hélène Mazo and Asuncion Moreno and Jan Odijk and Stelios Piperidis and Takenobu Tokunaga},
  publisher = {European Language Resources Association (ELRA)},
  address = {Paris, France},
  isbn = {979-10-95546-00-9},
  language = {english}
  }
 ```


## Contact
	Nguyen Minh Tien: tiennm@jaist.ac.jp
	Lai Dac Viet: vietld@jaist.ac.jp
	Nguyen Tien Huy: ntienhuy@jaist.ac.jp
