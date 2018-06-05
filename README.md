# TSix: A tweet-event summarization dataset

This is a social event summarization dataset. We crawled tweets related to 6 
events from Twitter using Twitter public API. The data is collected in 26 
continuous days. We provided the the clustered version of raw data with its 
two references: the machine-annotated set based on hashtag and the manually
annotated set created by two annotatators. 

Tweet data is divided by event, published date and cluster.


## Directories

The data is organized as follow:
  - from_top_bin_raw_data: the raw data collected from Twitter. You can use the DataReader.java file to read the data and do the cluster as the description in the paper.
  - data-cluster: Each event is clustered into multiple subtopics by Affinity Propagation.
  - reference-hashtag: An automatic reference of data-cluster using hashtag.
  					 File name pattern: "sum.<day>.<cluster>.<annotator>.txt"
  - reference-votting: An human-annotated reference created by two annotators.
  					 File name pattern: "sum.<day>.<cluster>.<annotator>.txt"

## Contributing

Please create an issue at https://github.com/nguyenlab/dataset reposiroty.
We encourage people to contribute to this repository and apply in practical
application.

## License & co

* Please cite our [paper] and share your idea by email if you use our data.
* The code in this repository is released under the terms of the
  [MIT license](LICENSE.txt).


## Contact
	Nguyen Minh Tien: tiennm@jaist.ac.jp
	Lai Dac Viet: vietld@jaist.ac.jp

