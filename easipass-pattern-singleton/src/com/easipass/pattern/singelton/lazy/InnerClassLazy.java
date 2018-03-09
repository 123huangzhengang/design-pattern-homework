package com.easipass.pattern.singelton.lazy;
/**
 * 内部类实现懒汉式单例线程安全
 */
public class InnerClassLazy {
	//单例是否被侵犯的标志位，没有共享，如果下个线程变为了true说明单例被侵犯了
	private boolean initialized = false;
	
	private InnerClassLazy(){
		synchronized(this){
			if(initialized == false){
				initialized = !initialized;
			}else{
				throw new RuntimeException("单例已被侵犯");
			}
		}
	}
	
	public static final InnerClassLazy getInstance(){
		return LazyHolder.innerClassLazy;
	}
	
	private static class LazyHolder{
		private static final InnerClassLazy innerClassLazy = new InnerClassLazy();
	}
}
