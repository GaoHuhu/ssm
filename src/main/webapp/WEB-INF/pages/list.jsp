<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/5/5
  Time: 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h4>查询所有账户信息</h4>

<table border="2">
    <tr bgcolor="red">
        <td>id</td>
        <td>name</td>
        <td>money</td>
    </tr>
    <c:forEach items="${users}" var="account">
        <tr style="border-style: solid" bgcolor="green">
            <td>${account.id}</td>
            <td>${account.name}</td>
            <td>${account.money}</td>
        </tr>
    </c:forEach>
</table>
<br>
<iframe src="//player.bilibili.com/player.html?aid=412935552&bvid=BV1FV411d7u7&cid=186917910&page=2" scrolling="no"
        border="0" frameborder="no" framespacing="0" allowfullscreen="true" width="100%" height="100%"></iframe>
</body>
</html>
