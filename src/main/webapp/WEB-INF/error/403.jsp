<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
//String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String basePath = path + "/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>error403</title>
		<link href="<%=basePath%>css/errorStyle.css" type="text/css" rel="stylesheet" />
	</head>
	<body>
       <div class="Cc-body" id="Cc-body">
       	 <div class="error-img bg403"></div>
       	 <div class="error-tip">
       	 	<p>服务器拒绝了您的浏览请求</p>
       	 	<p>请确认您拥有的访问权限</p>
       	 </div>
       </div>
	</body>
</html>