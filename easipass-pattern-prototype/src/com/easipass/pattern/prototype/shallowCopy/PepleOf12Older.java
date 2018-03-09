package com.easipass.pattern.prototype.shallowCopy;

public class PepleOf12Older implements Cloneable{
	private int age;
	private String sex;
	private String name;
	private OfoSharingBike ofo;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public PepleOf12Older(int age, String sex, String name, OfoSharingBike ofo) {
		super();
		this.age = age;
		this.sex = sex;
		this.name = name;
		if(age >= 12){
			this.ofo = ofo;
		}else{
			this.ofo = null;
		}
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public OfoSharingBike getOfo() {
		return ofo;
	}
	public void setOfo(OfoSharingBike ofo) {
		this.ofo = ofo;
	}
}
