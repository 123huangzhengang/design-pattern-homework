package com.easipass.pattern.prototype.shallowCopy;

public class OfoSharingBike {
	//单车编号
	private long num;
	//颜色
	private String color;
	//造价
	private double price;
	
	public OfoSharingBike(long num, String color, double price) {
		super();
		this.num = num;
		this.color = color;
		this.price = price;
	}
	public long getNum() {
		return num;
	}
	public void setNum(long num) {
		this.num = num;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
