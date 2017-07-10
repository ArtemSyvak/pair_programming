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

    Welcome in our shop!!
    <hr>


    <sf:form modelAttribute="user" action="addUserWithProduct" method="post" >
        Username
        <sf:input path="username"></sf:input>
        <br>
        Password
        <sf:password path="password"></sf:password>
        <br>
        Email
        <sf:input path="email"></sf:input>
        <br>
        Product
        <sf:input path="product"></sf:input>

        <input type="submit">
    </sf:form>
    <br>

    <h1><a href="cart">MyCart</a></h1>



</body>
</html>
