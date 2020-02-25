<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ include file= "header.jsp"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spform" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
  <h2>Register Here</h2>
  <spform:form action="carryuser" method="post" modelAttribute="usr" >
  <div class="form-group">
      <label for="username">UserName:</label>
      <spform:input type="text" class="form-control"  placeholder="Enter UserName" path="userName" />
    </div>
  <div class="form-group">
      <label for="password">Password:</label>
      <spform:input type="password" class="form-control" placeholder="Enter password" path="password"/>
    </div>
    <div class="form-group">
      <label for="email">Email:</label>
      <spform:input type="email" class="form-control"  placeholder="Enter email" path="email"/>
    </div>
    <div class="form-group">
      <label for="mobileno">MobileNo:</label>
      <spform:input type="text" class="form-control"  placeholder="Enter mobileno" path="mobileNo"/>
    </div>
    <spform:select path="role">
    <spform:option value="ROLE_USER">user</spform:option>
    <spform:option value="ROLE_ADMIN">admin</spform:option>
    </spform:select>
    <button type="submit" class="btn btn-primary">Submit</button>
  </spform:form>
</div>
</body>
</html>