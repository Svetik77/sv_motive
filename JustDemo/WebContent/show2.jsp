<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
 "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> show </title>
</head>
<body>
show <br><br>

<br><a href="addProduct.jsp"> link addProduct.jsp </a><br><br><br>


        <table border="1" width="2" cellspacing="3" cellpadding="2">
            <thead>
                <tr bgcolor="yellow">
                    <th>NAME</th>
                    <th> NAME</th>
                    <th>GRAMM</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>${param.loginName }</td>
                    <td>${param.prodName }</td>
                    <td>${param.gramm }</td>
                </tr>
              
            </tbody>
        </table>
        <br />

<br>-----------------------------------<br>
<c:forEach items="${cookie}" var="currentCookie">  
    Cookie name as map entry key: ${currentCookie.key}<br/>
    Cookie object as map entry value: ${currentCookie.value}<br/>
    Name property of Cookie object: ${currentCookie.value.name}<br/>
    Value property of Cookie object: ${currentCookie.value.value}<br/>
</c:forEach>

<h3>List of all the available Cookies</h3>
    <ul>
    <c:forEach var="cookies" items="${cookie}">
        <li>
            <c:out value="${cookies.key}"/>: 
                    Object=<c:out value="${cookies.value}"/>, <br>
                    value=<c:out value="${cookies.value.value}"/>
                    <br><br>
        </li>
    </c:forEach>
    </ul>
</body>
</html>