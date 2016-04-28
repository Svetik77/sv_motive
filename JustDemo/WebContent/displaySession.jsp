<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
 "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> displaySession </title>
</head>
<body>
displaySession <br><br>

<br><a href="addProduct.jsp"> link addProduct.jsp </a><br><br><br>
<br><a href="mysession.jsp"> link addProduct.jsp </a><br><br><br>
<br>-----------------------------------<br>
it is ok=> loginName : <c:out value="${sessionScope.loginName}" /> <br>
it is ok=>  prodName : <c:out value="${sessionScope.prodName}" /> <br>

             <br>  it is ok=>     ${sessionScope.prodName} <br><br><br>
<br>-----------------------------------<br><br>
        <table border="1" width="2" cellspacing="3" cellpadding="2">
            <thead>
                <tr bgcolor="yellow">
                    <th>NAME</th>
                    <th> NAME</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                     <td>${param.loginName }</td>
                    <td>${param.prodName }</td> 
                 
                </tr>
              
            </tbody>
        </table>
        <br />

<br>-----------------------------------<br>
</body>
</html>