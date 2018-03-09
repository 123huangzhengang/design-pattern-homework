package com.easipass.pattern.singelton.test;

import java.util.concurrent.CountDownLatch;

import com.easipass.pattern.singelton.hungry.Hungry;

public class HungryTest {
	public static void main(String[] args) { 
		int count = 500;
		//类似赛马，马栓解开就跑
        final CountDownLatch latch = new CountDownLatch(count);
        long start = System.currentTimeMillis();
        for(int i =0;i < count;i++){
        	new Thread(){
                public void run() {
                    try {
                    	//所有线程阻塞在这，等count减到0，开始跑，万箭齐发的感觉
                    	latch.await();
                       Object instance = Hungry.getInstance();
                       long time = System.currentTimeMillis();
                       System.out.println(time+ ",create a Object :" +instance);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                };
            }.start();
            //每开启一个线程-1
            latch.countDown();
       }
       long end = System.currentTimeMillis();
       System.out.println("耗时："+(end-start));
    }
}
