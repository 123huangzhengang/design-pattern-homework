package com.easipass.pattern.singelton.test;

import java.util.concurrent.CountDownLatch;

import com.easipass.pattern.singelton.register.BeanFactory;

public class BeanFactoryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int count = 200;
		final CountDownLatch latch = new CountDownLatch(count);
		long start = System.currentTimeMillis();
		for(int i=0;i<count;i++){
			new Thread(){
				public void run() {
					try {
						latch.await();
						try {
							long time = System.currentTimeMillis();
							Object bean = BeanFactory.getBean("com.easipass.pattern.singelton.register.pojo");
							System.out.println(time + "," + bean);
						} catch (ClassNotFoundException e) {
							e.printStackTrace();
						} catch (InstantiationException e) {
							e.printStackTrace();
						} catch (IllegalAccessException e) {
							e.printStackTrace();
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				};
			}.start();
			latch.countDown();
			
		}
		long end = System.currentTimeMillis();
		System.out.println("耗时：" + (end-start));
	}

}
