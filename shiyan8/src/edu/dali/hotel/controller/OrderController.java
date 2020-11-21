package edu.dali.hotel.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import edu.dali.hotel.server.*;
import edu.dali.hotel.entity.*;
import edu.dali.hotel.entity.Room;

import java.util.ArrayList;
import java.util.List;


/**
 * Servlet implementation class OrderController
 */
@WebServlet("/OrderController")
public class OrderController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		User user=(User)request.getSession().getAttribute("user");
		if(user!=null){
			String[] roomsNo=request.getParameterValues("selectedrooms");
			List<Room> orderroomlist=new ArrayList<Room>();
			for(String no:roomsNo)
			{
				Room room=RoomService.getRoomByNo(no);
				orderroomlist.add(room);
			}
			HttpSession session=request.getSession();
			session.setAttribute("orderroomlist",orderroomlist);
			response.sendRedirect("order_list.jsp");
			
		}else{
			System.out.print("<script>alert('你尚未登录，请登录...！')</script>");
			response.sendRedirect("login.html");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		OrderUser user=new OrderUser();
		user.setName(request.getParameter("name"));
		user.setAddress(request.getParameter("address"));
		user.setSex(request.getParameter("sex"));
		user.setTel(request.getParameter("tel"));
		int count=OrderServer.insert(user);
		if(count!=0){
			HttpSession session=request.getSession();
			session.setAttribute("user", user);
			response.sendRedirect("success.jsp");
		}else{
			response.sendRedirect("order_list.jsp");
		}
		
	}

}
