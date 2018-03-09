package com.easipass.pattern.singelton.test;

import java.util.concurrent.CountDownLatch;

import com.easipass.pattern.singelton.lazy.SynchronousLazy;

public class SynchronousLazyTest {

	public static void main(String[] args) {
		final int count = 5000;
		final CountDownLatch latch = new CountDownLatch(count);
		long start = System.currentTimeMillis();
		for(int i = 0;i < count;i++){
			new Thread(){
				public void run(){
					long time = System.currentTimeMillis();
					try {
						latch.await();
						Object instance = SynchronousLazy.getInstance();
						System.out.println(time + ",create a instance:" +instance);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					
				}
			}.start();
			latch.countDown();
		}
		long end = System.currentTimeMillis();
		System.out.println("耗时：" + (end-start));
		
	}
}
