<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/12
  Time: 14:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/common/include.jsp"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${list}" var="oi">
   商品的标题： <input type="text" value="${oi.title}"/>
   商品的价格： <input type="text" value="${oi.price}"/>

</c:forEach>

</body>
</html>
