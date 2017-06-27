<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'page.jsp' starting page</title>
  </head>
  
  <body>
  	<center>
		当前  <input type="text"  name="page.nowPage"  id="nowPage"  value="${page.nowPage }"  style="width:30px"/>  页
		每页  <input type="text"  name="page.number"  value="${page.number}" style="width:30px"/>  条
		<input type="hidden"  id="allPage"  value="${page.allPage}"/>
		共有  ${page.allPage}  页
		共有  ${page.allNumber}  条
		<a href="javaScript:toPage(1)">首页</a>
		<a href="javaScript:toPage(2)">上一页</a>
		<a href="javaScript:toPage(3)">下一页</a>
		<a href="javaScript:toPage(4)">尾页</a>
		<input type="submit"  value="跳转"/>
	</center>
	<script type="text/javascript">
		//1.获取当前页元素
		//2.判断请求的业务
		//3.给当前页的value属性重新赋值
		//4.提交表单，调用查询方法
			function toPage(flag){
				//1.获取当前页元素
				var nowPage = document.getElementById("nowPage");
				//2.判断请求的业务
				//首页
				if(flag == 1){
					//判断，如果当前页为第一页，则阻止下一步进行
					if(nowPage.value == 1){
						alert("当前为首页！");
						return  ;
					}
					//3.给当前页的value属性重新赋值
					nowPage.value = 1;
				}
				//上一页
				if(flag == 2){
					//判断，如果当前页为第一页，则阻止下一步进行
					if(nowPage.value == 1){
						alert("当前为首页！");
						return  ;
					}
					//上一页，则当前页的value属性值需要减1
					nowPage.value = nowPage.value - 1;
				}
				//下一页
				//需要获取总页数
				var allPage = document.getElementById("allPage");
				if(flag == 3){
				//判断，如果当前页与总页数的相等时，则阻止进行
					if(nowPage.value == allPage.value){
						alert("当前为最后一页！");
						return ;
					}
					nowPage.value = ++nowPage.value;
				}
				//尾页
				if(flag == 4){
					//判断，如果当前页与总页数的value属性值相等时，则阻止进行
					if(nowPage.value == allPage.value){
						alert("当前为最后一页！");
						return ;
					}
					nowPage.value = allPage.value;
				}
				//4.提交表单，调用查询方法
				//document.forms获取jsp页面所有的表单
				//document.forms[0]获取jsp页面第一个出现的表单
				//document.forms[0].submit()获取jsp页面第一个出现的表单并调用submit()方法
				document.forms[0].submit();
			}
		</script>
  </body>
</html>
