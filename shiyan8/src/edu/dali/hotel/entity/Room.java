package edu.dali.hotel.entity;

/**   
	* 项目名称：shiyan7   
	* 类名称：Room   
	* 类描述：   
	* 创建人：14167   
	* 创建时间：2020年5月21日 下午5:03:41   
	* @version        
　　*/

//创建room属性
public class Room {
	private String no;
	private String name;
	private String breakfast;
	private String type;
	private String broadband;
	private String rprice;
	private String bprice;
	private String booking;
   //构造方法
	public Room()
	{
		
	}
   //获取属性值
	public Room(String no,String name,String breakfast,String type,String broadband,String Rprice,String Bprice)
	{
		this.no=no;
		this.name=name;
		this.breakfast=breakfast;
		this.type=type;
		this.broadband=broadband;
		this.rprice=Rprice;
		this.bprice=Bprice;
	}
//	外界访问方法
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreakfast() {
		return breakfast;
	}
	public void setBreakfast(String breakfast) {
		this.breakfast = breakfast;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBroadband() {
		return broadband;
	}
	public void setBroadband(String broadband) {
		this.broadband = broadband;
	}
	public String getBprice() {
		return bprice;
	}
	public void setBprice(String bprice) {
		this.bprice = bprice;
	}
	public String getBooking() {
		return booking;
	}
	public void setBooking(String booking) {
		this.booking = booking;
	}
	public void setRprice(String rprice) {
		this.rprice = rprice;
	}
	public String getRprice() {
		return rprice;
	}


}
