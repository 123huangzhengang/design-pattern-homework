package com.easipass.pattern.singelton.test;

import java.util.concurrent.CountDownLatch;

import com.easipass.pattern.singelton.register.RegisterMap;

public class registerMapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final int count = 2;
		final CountDownLatch latch = new CountDownLatch(count);
		long start = System.currentTimeMillis();
		for(int i = 0;i < count;i++){
			new Thread(){
				public void run(){
					long time = System.currentTimeMillis();
					try {
						Thread.sleep(100);
						RegisterMap instance = RegisterMap.getInstance(null);
						System.out.println(time + ",create a RegisterMap" +instance);
						latch.countDown();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}.start();
		}
		try {
			latch.await();
			long end = System.currentTimeMillis();
			System.out.println("耗时：" + (end-start));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
