<%@ page language="java" import="edu.dali.hotel.server.*" import="edu.dali.hotel.entity.*" import="java.util.*" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>success.jsp</title> 
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="css/success.css">
	

  </head>
  
  <body>
<%
	request.setCharacterEncoding("utf-8");
	List<Room> orderroomlist=(List<Room>)session.getAttribute("orderroomlist");
%>  
	<div class="view">
		<table class="customers">
	     	<tr><td colspan="2" class="title">订单信息</td></tr>
		    <c:forEach items="${orderroomlist}" var="room">
	     	<tr>
	     		<td>${room.name}</td>
	     		<td>${room.bprice}</td>	
	     	</tr>
		    </c:forEach>
		  </table>
		  <div id="info">
		  <div class="row">
		  	<div class="cell"><label>姓名：</label></div>
		  	<div class="cell">${user.name}</div>
		  </div>
		  <div class="row">
		  	<div class="cell"><label>性别：</label></div>
		  	<div class="cell">${user.sex}</div>
		  </div>
		  <div class="row">
		  	<div class="cell"><label>住址：</label></div>
		  	<div class="cell">${user.address }</div>
		  </div>
		  <div class="row">
		  	<div class="cell"><label>电话号码：</label></div>
		  	<div class="cell">${user.tel}</div>
		  </div>
	 </div>	  
	</div>
  </body>
</html>
