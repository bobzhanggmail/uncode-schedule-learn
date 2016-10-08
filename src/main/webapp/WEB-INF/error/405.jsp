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
		<title>error405</title>
		<link href="<%=basePath%>css/errorStyle.css" type="text/css" rel="stylesheet" />
	</head>
	<body>
       <div class="Cc-body" id="Cc-body">
       	 <div class="error-img bg405"></div>
       	 <div class="error-tip">
       	 	<p>对于请求所标识的资源，不允许使用请求行中所指定的方法</p>
       	 </div>
       </div>
	</body>
</html>
