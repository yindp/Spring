package com.yinom.pdd.spring.test;

import com.yinom.pdd.spring.ioc.Job;
import com.yinom.pdd.spring.ioc.Lida;
import com.yinom.pdd.spring.model.Employee;
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

    @Test
    public void testJob01() {
        Job job = new Job();
        job.setTester(new Lida());
        job.doTest();
    }

    @Test
    public void testJob02() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
        Job job = (Job) ac.getBean("job");
        job.doTest();
    }

    /**
     * properties DI
     */
    @Test
    public void testEmployeeDI() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
        Employee emp = (Employee) ac.getBean("employee");
        System.out.println(emp);
    }
}
