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

