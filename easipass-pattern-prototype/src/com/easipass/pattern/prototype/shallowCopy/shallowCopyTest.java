package com.easipass.pattern.prototype.shallowCopy;

public class shallowCopyTest {

	/**
	 * 浅复制，对象是不通，都是依赖对象是同一个。
	 * 所有年龄12岁以上的人都可以坐ofo，同一辆车可以被多人使用
	 * 这个例子不太合理，人都是不同的。就这个场景练一下吧
	 */
	public static void main(String[] args) {
		OfoSharingBike ofo1 = new OfoSharingBike(1, "yellow", 999);
		PepleOf12Older p = new PepleOf12Older(12, "man", "xiaoming", ofo1);
		System.out.println(p.getOfo());
		try {
			PepleOf12Older clone =(PepleOf12Older) p.clone();
			System.out.println(clone.getOfo());
		}catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
