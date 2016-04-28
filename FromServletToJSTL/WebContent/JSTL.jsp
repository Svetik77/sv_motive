<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="styles/default.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index.jsp</title>
</head>
<body>index.jsp <br>

  <h2>Iterate through my array</h2>

    <ul>
        <c:forEach var="arrayVar" items="${mylist}">

            <li>${arrayVar}</li>


        </c:forEach>

    </ul>
<!-- ================================================================================ --> 

    <h2>Iterate through my arrayList</h2>

    <ul>
        <c:forEach var="name" items="${names}">

            <li>${name}</li>

        </c:forEach>
    </ul>

</body>
</html>