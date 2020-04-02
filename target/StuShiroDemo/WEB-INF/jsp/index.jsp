<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/29
  Time: 13:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ include file="/static/lib.jsp"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Hello World！</h1>
    <form action="login" method="post" >
        账号:<input type="text" name="userName" value="${msg}"/><br>
        密码<input type="password" name="passWord"/><br>
        <button type="submit">提交</button>
    </form>

</body>
</html>
