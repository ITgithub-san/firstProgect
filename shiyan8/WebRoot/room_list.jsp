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
    
    <title>room_list.jsp</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="css/roomlist.css">


  </head>
  	
  <body>
  <%
  		request.setCharacterEncoding("utf-8");
  		List<Room> roomList=(List<Room>)session.getAttribute("roomlist");
   %>

     <div>
     <form action="OrderController" method="get">
     <table class="customers">
     <caption>大理海湾国际酒店</caption>
        <tr>
	        <th>房型</th>
	        <th>早餐</th>
	        <th>床型</th>
	        <th>宽带</th>
	        <th>门市价</th>
	        <th>预定价</th>
	        <th>预定</th>
	     </tr>

	    <c:forEach items="${roomList}" var="room">
     	<tr>
     		<td id="name">${room.name}</td>
     		<td>${room.breakfast}</td>
     		<td>${room.type}</td>
     		<td>${room.broadband}</td>
     		<td id="rp">${room.rprice}</td>
     		<td id="bp">${room.bprice}</td>
     		<td><input name="selectedrooms" type="checkbox" value="${room.no}"></td>
     	</tr>
	    </c:forEach>
	    
		 <tr><td id="botton" colspan="7"><input type="submit" name="tijiao" value="提交预定"></td></tr>
     </table>
     </form>
     </div>
  </body>
</html>
