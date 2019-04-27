<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="common_things.Common_Things"%>
<%@page import="OCR.create_file"%>
<%@page import="OCR.read_file"%><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <!-- meta -->
    <meta charset="utf-8">
</head>
<body style="background-image:url('https://upload.wikimedia.org/wikipedia/en/0/07/Laiya_Beach_.jpg');">
                 <center><font face="Comic sans MS" size="7">TIME FOR "ACCURATE" RESULTS</font></center><br>	
                 <marquee><font face="Comic sans MS" size="4">Accuracy of 100% is an illusion, Try some hazy text to see my Failure!</font></marquee><br><br>
				<%
				String file_name=(String)request.getParameter("file_name");
				String file_name_given=(String)request.getParameter("file_name_given");
				//creating the out put file after upload and reading
				create_file obj_create_file=new create_file();
				obj_create_file.create_output_file(file_name);
				//read the created out put file
				read_file obj_read_file=new read_file();
				String read=obj_read_file.read_file(file_name);
				%>
				<center><p style = "border-radius=25px;width:290px;height:150px;border:2px solid white;padding:5px;margin:10px;line-height:30px;"><br>
				
				NAME OF THE FILE: <%=file_name %> <br><br>
				NAME OF THE FILE PROVIDED: <%=file_name_given %><br><br>
				</p></center>
<br>
<br>
<hr>
<center><%=read %></center><br><br>
<center><b>READ SUCCESSFUL!<b></b></center>
<hr>
<br><br>
<br><br><br>

</body>
</html>