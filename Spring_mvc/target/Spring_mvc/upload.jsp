<%--
  Created by IntelliJ IDEA.
  User: ZZT
  Date: 2022-8-17
  Time: 11:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/user/getData10" method="post" enctype="multipart/form-data">
        名称<input type="text" name="username"><br/>
        文件<input type="file" name="uploadfile"><br/>
        <input type="submit" value="提交"><br/>
    </form>
</body>
</html>
