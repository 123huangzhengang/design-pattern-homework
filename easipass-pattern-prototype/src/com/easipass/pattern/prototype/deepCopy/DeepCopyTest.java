package com.easipass.pattern.prototype.deepCopy;

public class DeepCopyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BMWCar bmwCar = new BMWCar();
		System.out.println(bmwCar.getTire());
		try {
			BMWCar clone = (BMWCar)bmwCar.clone();
			System.out.println(clone.getTire());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
