package com.easipass.pattern.factory.func;

import com.easipass.pattern.factory.BYDCar;
import com.easipass.pattern.factory.Car;

public class BYDFactory implements Carfactory{

	@Override
	public Car getCar() {
		return new BYDCar();
	}

}
