# infrrdAssign
Demo Project on FIle Upload delete copy

// Please Note i dont have any server right now so i am using my system to store the file.

Make Changes in application.properties file where you want to store the file

#file.upload-dir=/Users/rank0619/Desktop/UploadedFiles           //This line should be changed 

How to Use
1. First use http://localhost:8080/uploadFile url to upload files.
   This API consume formdata as file as key and file location as value.
   
2.  After this we can download the files using "/downloadFile/fileName"
3.  We can use "http://localhost:8080/copyFile/" to copy the files.
    It requires 2 form parameters.
    1. fileName : fileName.pdf
    2. copyTo   : absolutePath(where need to be copy)
