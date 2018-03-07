package com.easipass.pattern.factory.func;

import com.easipass.pattern.factory.Car;
import com.easipass.pattern.factory.PorscheCar;

public class PorscheFactory implements Carfactory{

	@Override
	public Car getCar() {
		return new PorscheCar();
	}

}
