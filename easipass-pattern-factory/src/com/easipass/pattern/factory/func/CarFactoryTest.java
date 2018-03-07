package com.easipass.pattern.factory.func;

public class CarFactoryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Carfactory bmwFactory = new BMWFactory();
		Carfactory benzFactory = new BenzFactory();
		System.out.println(benzFactory.getCar());

	}

}
