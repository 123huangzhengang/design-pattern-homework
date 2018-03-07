package com.easipass.pattern.factory.func;

import com.easipass.pattern.factory.BenzCar;
import com.easipass.pattern.factory.Car;

public class BenzFactory implements Carfactory{

	@Override
	public Car getCar() {
		return new BenzCar();
	}

}
