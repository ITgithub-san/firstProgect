package edu.dali.hotel.server;
import edu.dali.hotel.dao.JdbcDao;
import edu.dali.hotel.entity.*;

public class OrderServer {
	public static int insert(OrderUser user) {
		// TODO Auto-generated method stub
		int count=0;
		String sql="insert into orderuser(name,sex,tel,address) values('"+user.getName()+"','"+user.getSex()+"','"+user.getTel()+"','"+user.getAddress()+"') ";
		JdbcDao dao=new JdbcDao();
		count=dao.executeUpdate(sql);
		dao.close();
		return count;
	}

}
