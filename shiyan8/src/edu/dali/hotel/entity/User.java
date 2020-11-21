package edu.dali.hotel.entity;

/**   
	* 项目名称：shiyan7   
	* 类名称：User   
	* 类描述：   
	* 创建人：14167   
	* 创建时间：2020年5月17日 下午10:11:01   
	* @version        
　　*/
public class User {
	private String username; //用户名
	private String password;  //密码
	//构造函数
	public User(){
		
	}
	public User(String username,String password){
		this.username=username;
		this.password=password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
