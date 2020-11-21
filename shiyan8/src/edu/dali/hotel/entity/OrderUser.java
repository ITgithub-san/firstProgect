package edu.dali.hotel.entity;


/**   
	* 项目名称：shiyan7   
	* 类名称：OrderUser   
	* 类描述：   
	* 创建人：14167   
	* 创建时间：2020年5月29日 下午1:17:55   
	* @version        
　　*/
public class OrderUser {
	private String name;
	private String sex;
	private String tel;
	private String address;
//	构造函数
	public OrderUser() {

	}
//	获取值
	public OrderUser(String name,String sex,String tel,String address) {
		this.name=name;
		this.sex=sex;
		this.tel=tel;
		this.address=address;	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
