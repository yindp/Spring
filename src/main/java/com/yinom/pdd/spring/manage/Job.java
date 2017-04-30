package com.yinom.pdd.spring.manage;

/**
 * Created by yindp on 4/30/17.
 */
public class Job {
    private Tester tester;

    public void setTester(Tester tester) {
        this.tester = tester;
    }

    public void doTest() {
        tester.test();
    }
}
