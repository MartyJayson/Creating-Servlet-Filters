<%--
  Created by IntelliJ IDEA.
  User: mrers
  Date: 08.02.2021
  Time: 11:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/index.jsp">Home</a><br>
<form action="/registration" method="get">
<label>
    Name:
</label>
<input type="text" name="username"><br>
<label>
    Surname:
</label>
<input type="text" name="surname"><br>
<label>
    Date of birth:
</label>
<input type="date" name="birthday"><br>
<input type="radio" id="male" name="gender" value="male">
<label for="male">Male</label><br>
<input type="radio" id="female" name="gender" value="female">
<label for="female">Female</label><br>
<label>
    Password:
</label>
<input type="password" name="password">
<button>Sign Up</button>
</form>>
</body>
</html>
