package com.easipass.pattern.singelton.lazy;

public class AsynchronousLazy {
	
	private AsynchronousLazy(){}
	
	private static AsynchronousLazy asynchronousLazy = null;
	
	public static AsynchronousLazy getInstance() {
		if(asynchronousLazy == null){
			asynchronousLazy = new AsynchronousLazy();
			return asynchronousLazy;
		}else{
			return asynchronousLazy;
		}
		
	}
}
