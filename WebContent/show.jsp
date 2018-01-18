<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人图书信息管理</title>
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
<script type="text/javascript">
			
		function delbook(book,obj){
				if(confirm("确定删除吗?")==true){
					$.ajax({
						url:"delBook",
						type:"post",
						data:{userbook:book},
						dataType:"json",
							success:function(data){
								$(obj).parent().parent().parent().parent().remove();	//删除行
						}
					});
					
				}else{
					
					return ;
				}
			
			
		}		
					
					
				
			

			
		
</script>
</head>
<body>
		<form action="show" method="post">
			<table cellpadding="0" cellspacing="0" border="1" width="50%">
						<h1>图书信息</h1>
					<tr>
						
						<td>图书编号</td>
						<td>图书名称</td>
						<td>图书作者</td>
						<td>购买时间</td>
						<td>图书分类</td>
						<td>操作</td>
					</tr>
					
					<c:forEach  items="${list}"  var="k">
				<tr>
					   <td>${k.b_id }</td>
						<td>${k.b_name}</td>
						<td>${k.b_author }</td>
						<td>${k.datatime}</td>
						<td>${k.b_type }</td>
						<td><a href='javaScript:void(0)'  onclick='delbook(${k.b_id},this)'>删除</a></td>
					</tr>
					
					
				</c:forEach>
				
			</table>
		
		
		</form>
</html>