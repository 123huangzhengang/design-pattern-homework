package com.easipass.pattern.factory.simple;

import com.easipass.pattern.factory.Car;

public class SimpleFactoryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleFactory simpleFactory = new SimpleFactory();
		Car car = simpleFactory.getCar("Porsche");
		System.out.println(car);
	}

}
