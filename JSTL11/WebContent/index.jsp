<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br><br><br>

		<c:url value="/one.jsp" var="mydata">
		
			 <c:param name="id" value="101"/>
			 <c:param name="name" value="micky"/>
			 
		</c:url>
	<h2>	
		${mydata}
	</h2>		
			 
	<br><br>
	
	<a href="${mydata}">Click me=></a>		 

</body>
</html>