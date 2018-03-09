package com.easipass.pattern.singelton.lazy;

public class SynchronousLazy {
private static SynchronousLazy synchronousLazy = null;
	
	public static synchronized SynchronousLazy getInstance() {
		if(synchronousLazy == null){
			synchronousLazy = new SynchronousLazy();
			return synchronousLazy;
		}else{
			return synchronousLazy;
		}
		
	}
}
