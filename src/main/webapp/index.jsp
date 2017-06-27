<%@ page import="com.gb.pojo.Admin" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/common/include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>淘宝宝系统首页</title>
    <%
        com.gb.pojo.Admin admin = (Admin) session.getAttribute("admin");
        if (admin != null) {//说明 登录成功
            //后台 主页面
            response.sendRedirect(request.getContextPath()+"/login/toshow.ty");
        } else {//说明 用户没有登录
            response.sendRedirect(request.getContextPath()+"/login/tologin.ty");
        }
    %>
</head>
<body>
首页！！！！！！！！！！！
</body>
</html>

