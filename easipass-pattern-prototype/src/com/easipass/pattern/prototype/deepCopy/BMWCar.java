package com.easipass.pattern.prototype.deepCopy;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class BMWCar extends Car implements Cloneable,Serializable{
	private Tire tire;
	public Tire getTire() {
		return tire;
	}
	public void setTire(Tire tire) {
		this.tire = tire;
	}
	public BMWCar(){
		this.setTrademark("BMW");
		this.setPrice(300000);
		setTire(new Tire("佳通轮胎", 16, 2000, "天然1橡胶"));
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return deepClone();
	}
	private Object deepClone() {
		Object  obj = null;
		try {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			oos.writeObject(this);
			oos.flush();
			oos.close();
			
			ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bis);
			obj = ois.readObject();
			return obj;
		} catch (IOException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return obj;
	}
	
}
