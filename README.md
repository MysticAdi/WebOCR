# WebOCR
Web Based OCR Sytem in Java

The mode of capturing texts from a particular image has become a necessity with the ever
increasing paperworks and archives that needs to be stored and preserved. Optical
Character Recognition also extends to the feature of identifying text from an image while
providing aids for language to language conversion. This particular project demonstrates the
Tessdata based Web Oriented OCR system entirely backed by JAVA. The recognition of text
from the images uploaded onto the User PC via implementing system calls in JAVA along
with the preservation of the result set into MongoDB has been demonstrated. User Interface
has been implemented using Java Server Pages over Tomcat Servers, while also putting
forward JavaFX extension for the application.

The following project was implemented on Eclipse IDE by the usage of JAVA EE Edition 10
which provided for the Dynamic Web Application capabilities. The complete program is
hosted on Apache Tomcat Server v8.5 which can be run as an application or as Server Page
on the IDE. The user is required to access the localhost , which shows a prompt for entering
the image that needs to be processed along with the desired text file to be generated to
stream the result set.

These functionalities have been included via the create_file and read_file Java classes,
which make use of system calls provided by the SyncPipe library to trace the input file
location on the system. If found, it gives a signal to the FileUploadHandler class present in
the Upload_Data package.

This package makes use of other utilities such as Connection library, SQL library ,Servlet
library for providing request and response capabilities, Iterator library to traverse over the
requested image file alongside FileItem library which handles the majority of File
Manipulation functions on the Input and Output files and their generated streams.

Once the file has been detected, the FileUploadHandler provides the data to the Tesseract
Engine running on the User PC which makes use of Object Scoping, Greyscaling followed by
Edge Detection techniques to compare the raw data with the TessData dataset , thus
analysing for the highest confidence level percentage. The detection of highest confidence
level set is then followed by the generation of Output Stream to upload the result data onto a
text file. This is handled by the read_file class in the OCR package. The function
getOutputStream() in the mentioned class outputs the result set characters onto the desired
Output File.

Once the Output file is generated, user is taken to the output page ( named read.jsp ) which
in turn derives the text present in the result file. This is where FileUploadHandler comes into
the picture again. It generates an getInputStream() , which uploads the text character by
character onto the Display Label on the Web Page thus providing for dynamic and immediate
display of the output to the user as and when the input is fed.
These functionalities have been aided by two Java Server Pages namely index.jsp and
read.jsp. The homepage for the application that seeks the input from the user has been
mentioned in index.jsp. The transition from index.jsp and read.jsp is cumulated with the
FileUploadHandler working in the background for a split second. This is followed by the
output being displayed in a View Label present in read.jsp Server Page along with the file
name that was mentioned by the user for the same.

MongoDB Compass has been incorporated as a Cloud Database for the storage of input file
name and the output file data in a JSON style document to acquire the previously accessed
files as and when required. The Mongo Client has been provided by the JDBC Manager
while just requiring the User Key and the Credentials for security log in for accessing the
data.

All the aforementioned facilities have been combined into one application by the usage of
JavaFX framework to provide for the connectivity between the JSP and the View Panel of the
application window. OnClick events have been enabled so as to ensure dynamic responses
on both JSP format and the UI format by the user.
