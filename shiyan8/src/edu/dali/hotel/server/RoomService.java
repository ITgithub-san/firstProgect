package edu.dali.hotel.server;
import edu.dali.hotel.entity.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import edu.dali.hotel.dao.JdbcDao;


/**   
	* 项目名称：shiyan7   
	* 类名称：RoomService   
	* 类描述：   
	* 创建人：14167   
	* 创建时间：2020年5月21日 下午5:04:23   
	* @version        
　　*/

//从数据库获取相应属性，存入list
public class RoomService {
	static public List<Room> getRoomList(){
		//连接字符串串
		String sql="select * from room";
		JdbcDao dao=new JdbcDao();
		ResultSet rs=dao.executeQuery(sql);
		
		List<Room> roomList=new ArrayList<Room>();
		//循环读取数据
		try {
			while(rs.next()){
				Room room=new Room();
				room.setNo(rs.getString("no"));
				room.setName(rs.getString("name"));
				room.setBreakfast(rs.getString("breakfast"));
				room.setType(rs.getString("type"));
				room.setBroadband(rs.getString("broadband"));
				room.setRprice(rs.getString("rprice"));
				room.setBprice(rs.getString("bprice"));
				
				
				roomList.add(room);
												
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		dao.close();

		return roomList;
	}
	
//	通过No查找数据
	static public Room getRoomByNo(String no){
		String sql="select * from room where no='"+no+"'";
		JdbcDao dao=new JdbcDao();
		ResultSet rs=dao.executeQuery(sql);
		
		Room room=null;
//循环获取选择的房间列表
		try {
			if(rs!=null&&rs.next()){
				room=new Room();
				room.setName(rs.getString("name"));
				room.setBreakfast(rs.getString("breakfast"));
				room.setType(rs.getString("type"));
				room.setBroadband(rs.getString("broadband"));
				room.setRprice(rs.getString("rprice"));
				room.setBprice(rs.getString("bprice"));
												
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		dao.close();
		return room;
	}
}

