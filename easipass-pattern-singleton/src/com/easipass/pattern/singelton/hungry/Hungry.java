package com.easipass.pattern.singelton.hungry;

public class Hungry {
	private Hungry(){};
	private static final Hungry HUNGRY = new Hungry();
	public static Hungry getInstance() {
		return HUNGRY;
		
	}
}
