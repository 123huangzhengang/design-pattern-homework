package com.easipass.pattern.singelton.seriable;

import java.io.Serializable;


/**
 * 当序列化和反序列化的时候，会破坏单例，生成一个克隆对象。
 *解决方法，在序列化对象添加一个方法readResolve,JVM在反序列化的时候会调用，返回一个单例对象，这样就和序列化的对象是同一个了
 */
public class Seriable implements Serializable{
	 public  final static Seriable INSTANCE = new Seriable();
	    private Seriable(){}

	    public static  Seriable getInstance(){
	        return INSTANCE;
	    }
//反序列化的时候,JVM会自动调用这个方法，返回同个对象
	    private  Object readResolve(){
	        return  INSTANCE;
	    }
}
