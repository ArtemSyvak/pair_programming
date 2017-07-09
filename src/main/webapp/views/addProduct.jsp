<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Artem
  Date: 10.07.2017
  Time: 1:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>addProduct</title>
</head>
<body>

    <sf:form modelAttribute="product" action="createProduct" method="post">

        Group
        <sf:input path="artistName"></sf:input>
        Album
        <sf:input path="releaseName"></sf:input>
        Genre
        <sf:input path="genre"></sf:input>
        Price
        <sf:input path="price"></sf:input>
        <input type="submit">

    </sf:form>

</body>
</html>
