package com.easipass.pattern.singelton.register;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RegisterMap {
	private RegisterMap(){}
	private static Map<String,Object> registerMap = new HashMap<String,Object>();
	
	public static RegisterMap getInstance(String name){
		if(name ==null || "".equals(name)){
			name = RegisterMap.class.getName();
		}
		if(!registerMap.containsKey(name)){
			registerMap.put(name, new RegisterMap());
		}
		return (RegisterMap) registerMap.get(name);
		
		
	}
}
