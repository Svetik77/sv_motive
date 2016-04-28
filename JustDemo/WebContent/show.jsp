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

<br><a href="addProduct.jsp"> link </a><br><br><br>


        <table border="1" width="2" cellspacing="3" cellpadding="2">
            <thead>
                <tr bgcolor="yellow">
                    <th> NAME</th>
                    <th>GRAMM</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>${param.prodName }</td>
                    <td>${param.gramm }</td>
                </tr>
              
            </tbody>
        </table>
        <br />

<br>-----------------------------------<br>


</body>
</html>