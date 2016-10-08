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
		<title>error500</title>
		<link href="<%=basePath%>css/errorStyle.css" type="text/css" rel="stylesheet" />
	</head>
	<body>
       <div class="Cc-body" id="Cc-body">
       	 <div class="error-img bg500"></div>
       	 <div class="error-tip">
       	 	<p>服务器内部错误，请稍后重试</p>
       	 	<p>如果问题依然存在，请与服务器的管理员联系</p>
       	 </div>
       </div>
	</body>
</html>
