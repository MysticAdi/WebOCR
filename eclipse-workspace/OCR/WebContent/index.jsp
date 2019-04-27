<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="common_things.Common_Things"%><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <!-- meta -->
    <meta charset="utf-8">
</head>
<body style="background-image:url('https://upload.wikimedia.org/wikipedia/en/0/07/Laiya_Beach_.jpg');">	 
                <center><font face="Comic sans MS" size="7">OCR TIME</font></center><br>
                <marquee><font face="Comic sans MS" size="4"> The Tesseract is the four-dimensional analogue of the cube</font></marquee><br><br>
                
                
		<center>	<form action="<%=Common_Things.url %>/FileUploadHandler/" enctype="multipart/form-data" method="post">
			<p style = "border-radius=25px;width:450px;height:300px;border:2px solid white;padding:5px;margin:10px;line-height:30px;">
			                   Please Enter the name of the image to be uploaded ( With Extension)<br><br>
				               Select:<input type="text" name="file_name" /><br><br>
				               Please Enter the name of the file for Output Display<br><br>
							   File name:<input type="text" name="file_name_given">             <br><br>
				              <input type="submit" value="Upload Image" />
				</p>  </form>  </center>
				  
</body>
</html>