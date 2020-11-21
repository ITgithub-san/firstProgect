package edu.dali.hotel.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import edu.dali.hotel.server.*;
import edu.dali.hotel.entity.Room;
import java.util.List;


/**
 * Servlet implementation class RoomController
 */
@WebServlet("/RoomController")
public class RoomController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RoomController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		定义编码方式
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
//		获取房间列表
  		List<Room> roomList=RoomService.getRoomList();
  	  	HttpSession session=request.getSession();
//  	  	保存房间列表
  	  	session.setAttribute("roomList", roomList);
//  	  	页面跳转
  	  	response.sendRedirect("room_list.jsp");


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

}
