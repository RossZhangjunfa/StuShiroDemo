<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/29
  Time: 13:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="login" method="post" style="margin: 0 auto">
        账号:<input type="text" name="userName" /><br>
        密码<input type="password" name="passWord"/><br>
        <button type="submit">提交</button>
    </form>
    <span style="color: red;">${msg}</span>
</body>
</html>
