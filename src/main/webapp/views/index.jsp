<%--
  Created by IntelliJ IDEA.
  User: Artem
  Date: 06.07.2017
  Time: 21:44
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="catalog.jsp">
    <title>Index</title>
</head>
<body>

    index
    <a href="/catalog">catalog_azaza</a>

    <a href="/login">Log In</a>



    <sf:form modelAttribute="user" action="loginAction" method="post" >
        Username
        <sf:input path="userName"></sf:input>
        <br>
        Password
        <sf:password path="password"></sf:password>
        <br>
        Email
        <sf:input path="email"></sf:input>
        <input type="submit">
    </sf:form>
    <br>

    <h1><a href="addProduct">Add product</a></h1>



</body>
</html>
