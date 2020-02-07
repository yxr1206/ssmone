<%--
  Created by IntelliJ IDEA.
  User: ye
  Date: 2019/11/29
  Time: 09:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>主页面</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
用户名：  ${requestScope.user_name } (这是来自数据库的数据) <br/>
密    码：  ${requestScope.password } (这是经过Sevice层处理过的密码) <br/>
(made by william)
</body>
</html>