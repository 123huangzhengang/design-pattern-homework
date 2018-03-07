package com.easipass.pattern.factory.abstr;

import com.easipass.pattern.factory.BMWCar;
import com.easipass.pattern.factory.BYDCar;
import com.easipass.pattern.factory.BenzCar;
import com.easipass.pattern.factory.Car;
import com.easipass.pattern.factory.PorscheCar;

public class AbstractFactoryImpl extends AbstractCar{

	@Override
	Car getBMWCar() {
		return new BMWCar();
	}

	@Override
	Car getBYDCar() {
		return new BYDCar();
	}

	@Override
	Car getBenzCar() {
		return new BenzCar();
	}

	@Override
	Car getPorscheCar() {
		return new PorscheCar();
	}

}
