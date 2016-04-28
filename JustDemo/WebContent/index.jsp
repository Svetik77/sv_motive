<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
 "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Index</title>
</head>
<body>
	Index
	<br>
	<br>

	<br>
	<a href="date.jsp"> link date.jsp</a><br>
	<br>

	<c:forEach var="cookieVal" items="${cookie}">
		<c:out value="${cookieVal.value.value}" />
	</c:forEach>
	<br>-----------------------------------

	<br>-----------------------------------
	<br>
 <br>-----------------------------------
	<br>           
            
</body>
</html>