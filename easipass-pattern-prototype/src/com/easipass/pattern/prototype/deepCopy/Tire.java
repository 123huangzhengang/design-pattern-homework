package com.easipass.pattern.prototype.deepCopy;

import java.io.Serializable;

public class Tire implements Serializable{
	private String trademark;
	private double size;
	private double price;
	public Tire(String trademark, double size, double price, String material) {
		super();
		this.trademark = trademark;
		this.size = size;
		this.price = price;
		this.material = material;
	}
	private String material;
	public String getTrademark() {
		return trademark;
	}
	public void setTrademark(String trademark) {
		this.trademark = trademark;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
}
