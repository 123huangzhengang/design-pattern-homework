package com.easipass.pattern.factory.simple;

import com.easipass.pattern.factory.BMWCar;
import com.easipass.pattern.factory.BYDCar;
import com.easipass.pattern.factory.BenzCar;
import com.easipass.pattern.factory.Car;
import com.easipass.pattern.factory.PorscheCar;

public class SimpleFactory {
	
	public Car getCar(String carName){
		if("BMW".equals(carName)){
			return new BMWCar();
		}if("Benz".equals(carName)){
			return new BenzCar();
		}if("BYD".equals(carName)){
			return new BYDCar();
		}if("Porsche".equals(carName)){
			return new PorscheCar();
		}else{
			System.out.println("?????????????????");
			return null;
		}
	}
}
