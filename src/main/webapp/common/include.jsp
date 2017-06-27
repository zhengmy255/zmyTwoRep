<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 



<!-- 如何导入这个jsp文件 -->
 <%-- <%@ include file="/common/include.jsp" %> --%>


<!-- css渲染页面效果  -->
<link rel="stylesheet" href="<%=request.getContextPath()%>/js/artDialog/css/ui-dialog.css">
<link style="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/easyui1.4.5/themes/icon.css">
<link style="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/easyui1.4.5/themes/default/easyui.css">
<link style="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/js/uploadify/uploadify.css">
<!-- JS库 -->
<!-- JQuery库 -->
<script type="text/javascript" src="<%=request.getContextPath()%>/easyui1.4.5/jquery.min.js"></script>
<!-- artDialog库 -->
<script src="<%=request.getContextPath()%>/js/artDialog/dist/dialog-min.js"></script>
<!-- My97库 -->
<script src="<%=request.getContextPath()%>/js/My97/WdatePicker.js"></script>
<!-- uploadify库 -->
<script src="<%=request.getContextPath()%>/js/uploadify/jquery.uploadify.min.js"></script>



<script type="text/javascript" src="<%=request.getContextPath()%>/easyui1.4.5/jquery.easyui.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/easyui1.4.5/locale/easyui-lang-zh_CN.js"></script>



