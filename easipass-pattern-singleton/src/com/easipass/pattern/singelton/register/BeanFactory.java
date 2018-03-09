package com.easipass.pattern.singelton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BeanFactory {
	
	private BeanFactory(){}
	
	private static Map<String,Object> ioc = new ConcurrentHashMap<String,Object>();
	
	public static Object getBean(String className) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		Object obj = null;
		if(!ioc.containsKey(className)){
			obj = Class.forName(className).newInstance();
			ioc.put(className, obj);
		}else{
			obj = ioc.get(className);
		}
		return obj;
	}
}
