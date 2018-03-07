package com.easipass.pattern.factory.func;

import com.easipass.pattern.factory.BMWCar;
import com.easipass.pattern.factory.Car;

public class BMWFactory implements Carfactory{

	@Override
	public Car getCar() {
		return new BMWCar();
	}

}
