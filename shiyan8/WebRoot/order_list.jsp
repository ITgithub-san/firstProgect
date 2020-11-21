·<%@ page language="java" import="edu.dali.hotel.server.*" import="edu.dali.hotel.entity.*" import="java.util.*" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<!DOCTYPE>
<html>
  <head>
  	<link rel="stylesheet" type="text/css" href="css/room.css">
    <base href="<%=basePath%>">    
    <title>room_list.jsp</title>
  </head>
  	
  <body>
  <%
  		request.setCharacterEncoding("utf-8");
  		List<Room> orderroomlist=(List<Room>)session.getAttribute("orderroomlist");
   %>

     <div>
     <table class="main">
     	<tr><td class="title">你选的房间如下</td></tr>   	
	    <c:forEach items="${orderroomlist}" var="rooms">
     	<tr>
     		<td id=col>${rooms.name}</td>
     		<td>${rooms.bprice}</td>	
     	</tr>
	    </c:forEach>
	    
     </table>
     <form action="OrderController" method="post">
	     <table class="model">
	     <tr><td  colspan="2" class="title">请输入你的联系信息：</td></tr>
	     <tr><td>姓名</td><td id="text"><input type="text" name="name" ></td></tr>
	     <tr><td>性别<td id="text"><input type="text" name="sex" ></td></tr>
	      <tr><td>电话</td><td id="text"><input type="text" name="tel"></td></tr>
	      <tr><td>地址</td><td id="text"><input type="text" name="address"></td></tr>
	      <tr><td colspan="2" id="botton"><input type="submit" name="tijiao" value="提交"></td></tr>
	     </table>
     </form>
     </div>
  </body>
</html>
