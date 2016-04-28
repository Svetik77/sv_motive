<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login2.jsp</title>
</head>
<body>login2.jsp <br> <br>

<c:choose>
    <c:when test="${empty param.txtname}">
        Please enter your name.
    </c:when>
    <c:otherwise>
        Hello <b><c:out value="${param.txtname}" /></b>!
    </c:otherwise>
</c:choose>
 <br> from login2.jsp <br>
 
<form action="MyCookie" method="get">
		<table>
			<tr>
				<td>User name: </td>
				<td bordercolor="blue"  bgcolor="green"  >
				<input name="loginName" type="text" value="Alina" style="background-color: yellow;"/>
				<br></td>
			</tr>
			
			<tr>
				<td>User name: </td>
				<td bordercolor="blue"  bgcolor="green"  >
				<input name="prodName" type="text" value="Gipfel" style="background-color: yellow;"/>
				<br></td>
			</tr>
			
			
			<tr>
				<td>Password: </td>
				<td bordercolor="blue"  bgcolor="green"  >
				<input name="gramm" type="text"  value="12" style="background-color: yellow;"/>
				<br></td>
			</tr>
			
			
		</table><br>
		<input type="submit" value="v3"/>
	</form>

</body>
</html>