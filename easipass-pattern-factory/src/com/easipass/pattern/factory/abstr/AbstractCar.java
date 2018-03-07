package com.easipass.pattern.factory.abstr;

import com.easipass.pattern.factory.Car;

public abstract class AbstractCar {
	//公共配置
	//方便同意管理
	
	abstract Car getBMWCar();
	
	abstract Car getBenzCar();
	
	abstract Car getBYDCar();
	
	abstract Car getPorscheCar();
}
