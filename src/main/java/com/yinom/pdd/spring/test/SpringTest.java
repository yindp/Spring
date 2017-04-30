package com.yinom.pdd.spring.test;

import com.yinom.pdd.spring.service.HelloSpring;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yindp on 4/30/17.
 */
public class SpringTest {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void test() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
        HelloSpring hs = (HelloSpring) ac.getBean("helloSpring");
        hs.sayHi();
    }
}
