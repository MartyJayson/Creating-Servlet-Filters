<%--
  Created by IntelliJ IDEA.
  User: mrers
  Date: 08.02.2021
  Time: 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/index.jsp">Home</a>
<form action="/login" method="get">
    <label>
        Name:
    </label>
    <input type="text" name="username"><br>
    <label>
        Password:
    </label>
    <input type="password" name="password">
    <button>Log In</button>
</form>
</body>
</html>
