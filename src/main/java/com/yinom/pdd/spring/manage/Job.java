package com.yinom.pdd.spring.manage;

public class Job {
	private Tester tester;
	
	public void setTester(Tester tester) {
		this.tester = tester;
	}

	public void doTest(){
		/*Zhangming zm = new Zhangming();
		zm.test();*/
		/*Lida ld = new Lida();
		ld.test();*/
		tester.test();
	}
}
