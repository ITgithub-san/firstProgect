package edu.dali.hotel.server;

import java.sql.ResultSet;
import java.sql.SQLException;
import edu.dali.hotel.dao.JdbcDao;
import edu.dali.hotel.entity.User;

/**   
	* 项目名称：shiyan7   
	* 类名称：UserServer   
	* 类描述：   
	* 创建人：14167   
	* 创建时间：2020年5月21日 下午5:04:33   
	* @version        
　　*/
public class UserServer {
	static public User login(String username,String password)
	{
		User user=null;
		String sql="select * from User where username='"+username+"' and password='"+password+"'";
		JdbcDao dao=new JdbcDao();
		ResultSet rs=dao.executeQuery(sql);
		try {
			if(rs!=null){
				user=new User();
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
												
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dao.close();
		return user;
		
	}
}
