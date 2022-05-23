<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+       //当前协议    http等
request.getServerName()+":"+     //服务器的地址 127.0.0.1
request.getServerPort()+         //当前端口号
path+"/";                        //应用名称
%>
<html>
<head>
	<base href="<%=basePath%>"></head>
<meta charset="UTF-8">
<link href="jquery/bootstrap_3.3.0/css/bootstrap.min.css" type="text/css" rel="stylesheet" />
<script type="text/javascript" src="jquery/jquery-1.11.1-min.js"></script>
<script type="text/javascript" src="jquery/bootstrap_3.3.0/js/bootstrap.min.js"></script>

</head>
<body>
	<img src="image/home.png" style="position: relative;top: -10px; left: -10px;"/>
</body>
</html>