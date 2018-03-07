package com.easipass.pattern.factory.abstr;

public class AbstractFactoryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractFactoryImpl abstractFactoryImpl = new AbstractFactoryImpl();
		System.out.println(abstractFactoryImpl.getPorscheCar());
	}
}
