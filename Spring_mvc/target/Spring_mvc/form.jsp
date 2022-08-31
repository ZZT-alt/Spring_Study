<%--
  Created by IntelliJ IDEA.
  User: ZZT
  Date: 2022-8-16
  Time: 22:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <form action="${pageContext.request.contextPath}/user/getData3" method="post">
        <input type="text" name="userList[0].name"><br/>
        <input type="text" name="userList[0].address"><br/>
        <input type="text" name="userList[1].name"><br/>
        <input type="text" name="userList[1].address"><br/>
        <input type="submit" value="提交">
  </form>
</body>
</html>
