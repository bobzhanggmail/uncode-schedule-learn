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
		<title>error404</title>
		<link href="<%=basePath%>css/errorStyle.css" type="text/css" rel="stylesheet" />
	</head>
	<body>
       <div class="Cc-body" id="Cc-body">
       	 <div class="error-img bg404"></div>
       	 <div class="error-tip">
       	 	<p>无法找到您所请求的页面</p>
       	 	<p>请确认您输入的页面地址是否错误</p>
       	 </div>
       </div>
	</body>
</html>
