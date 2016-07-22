# ImageCompressLibrary
Compress Image to reduce bandwidth usage and compare result with different libraries. In this project different libraries are compared in terms of quality and compressed image size by giving different dimensions and quality..This project is in Java language with JSP files..

The libraries which compared are:

1. ImageMagick

2. DIP(Digital Image Processing) using Java functions 

3. Imagej

Only by giving image URL this project create compressed image of diffrent dimension using all libraries and safe in local directory choosen at run time by user itself...
![alt tag](https://cloud.githubusercontent.com/assets/20204963/16907026/0bbd067e-4cdd-11e6-922c-8380c753f074.png)
#Folder Created on choosed Directory

![alt-tag](https://cloud.githubusercontent.com/assets/20204963/16907028/121f4acc-4cdd-11e6-919e-56aa98c5fb88.png)

#Benefits
This project gives compressed image result of all libraries which display in JSP file So, user can directly compare the results at the same time and choose library according to their requirements...

![alt-tag](https://cloud.githubusercontent.com/assets/20204963/16907024/06f1954c-4cdd-11e6-8a36-8a27d1e33425.png)

#Images saved in folder
![alt-tag](https://cloud.githubusercontent.com/assets/20204963/16907196/0d8188ac-4cdf-11e6-8b43-151af1ac87cb.png)

#Prerequisite

1.Ubuntu

2.Imagemagick 

3.Tomcat server

4.ANT or ECLIPSE IDE


#Steps to run project

1 Install Apache Tomcat Server in your system.

2 Goto build.properties file and change the value of "home" variable to the path to your tomact

3 Download ImageMagick using command
 
   sudo apt-get install imagemagick

4 To build this project either install ANT using command

     sudo apt-get install ant
    
    Otherwise can use Eclipse IDE for build process
    
5 Run "build.xml" file using "ant build" command if ANT is installed or simply in Eclipse as ANT Build which create .war file on tomcat webapps folder.

6 Start tomcat by running "startup.sh" file which is in "bin" folder of tomcat using command
       
      ./startup.sh
7 Open browser and type
     
      http://localhost:8080/ImageCompression/index

8 Give Image URL

9 Image Compression done... 

    
    



