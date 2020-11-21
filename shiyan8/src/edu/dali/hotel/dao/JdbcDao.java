package edu.dali.hotel.dao;
import java.sql.*;
public class JdbcDao {

	private String driverStr = "com.mysql.jdbc.Driver";
	private String connStr = "jdbc:mysql://localhost:3306/hotel?user=root&password=root&useUnicode=true&characterEncoding=utf-8";
	private Connection connection = null;
	private Statement stmt=null;
	private ResultSet rs = null;

	public JdbcDao() {
		try {
			Class.forName(driverStr);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private Connection getConnection(){
		try {
			connection=DriverManager.getConnection(connStr);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

	private Statement createStatement(){
		try {
			stmt=getConnection().createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return stmt;
	}
	public ResultSet executeQuery(String sql) {
		try {
			rs = createStatement().executeQuery(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}

	public int executeUpdate(String sql) {
		int result = 0;
		try {
			result = createStatement().executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public void close(){
		try {
			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
			if (connection != null)
				connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
