 <%@page import="com.chinna.Ecommerce.model.Product"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false"  %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="x" %>
  <%@ include file= "header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="3" align="center">
<tr><th>productID</th>
<th>productName</th>
<th>productPrice</th>
<th>more information</th>
</tr>
<x:forEach  items= "${productList}" var="pro">
<tr>
<td>${pro.productId}</td>
<td>${pro.productName}</td>
<td>${pro.productPrice}</td>
<td><a href="info?pid=${pro.productId}">more-info</a></td>
</tr>
</x:forEach>
</table>
</body>
</html>