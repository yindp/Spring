package com.yinom.pdd.spring.test;

import com.yinom.pdd.spring.ioc.Job;
import com.yinom.pdd.spring.ioc.Lida;
import com.yinom.pdd.spring.model.Department;
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
    ApplicationContext ac=null;
    @Before
    public void setUp() throws Exception {
        ac=ac = new ClassPathXmlApplicationContext("application.xml");
    }

    @Test
    public void test() {
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
        Job job = (Job) ac.getBean("job");
        job.doTest();
    }

    /**
     * properties DI
     */
    @Test
    public void testEmployeeDI01() {
        Employee emp = (Employee) ac.getBean("employee1");
        System.out.println(emp);
    }
    /**
     * constructor type DI
     */
    @Test
    public void testEmployeeDI02() {
        Employee emp = (Employee) ac.getBean("employee2");
        System.out.println(emp);
    }
    /**
     * constructor index DI
     */
    @Test
    public void testEmployeeDI03() {
        Employee emp = (Employee) ac.getBean("employee3");
        System.out.println(emp);
    }
    /**
     * Factory instance DI
     */
    @Test
    public void testEmployeeDI05() {
        Employee emp = (Employee) ac.getBean("employee5");
        System.out.println(emp);
    }

    /**
     * Static Factory instance DI
     */
    @Test
    public void testEmployeeDI06() {
        Employee emp = (Employee) ac.getBean("employee6");
        System.out.println(emp);
    }
    /**
     * bean DI
     */
    @Test
    public void testEmployeeDI07() {
        Employee emp = (Employee) ac.getBean("employee7");
        System.out.println(emp);
    }

    /**
     * Internal bean DI
     */
    @Test
    public void testEmployeeDI08() {
        Employee emp = (Employee) ac.getBean("employee8");
        System.out.println(emp);
    }
    /**
     * List Collection DI
     */
    @Test
    public void testEmployeeDI09() {
        Employee emp = (Employee) ac.getBean("employee9");
        System.out.println(emp);
    }
    /**
     * Set Collection DI
     */
    @Test
    public void testEmployeeDI10() {
        Employee emp = (Employee) ac.getBean("employee10");
        System.out.println(emp);
    }

    /**
     * Map Collection DI
     */
    @Test
    public void testEmployeeDI11() {
        Employee emp = (Employee) ac.getBean("employee11");
        System.out.println(emp);
    }
    /**
     * Properties  DI
     */
    @Test
    public void testEmployeeDI12() {
        Employee emp = (Employee) ac.getBean("employee12");
        System.out.println(emp);
    }
    /**
     * AutoWired
     */
    @Test
    public void testEmployeeDI13() {
        Department dept = (Department) ac.getBean("dept1");
        System.out.println(dept);
    }

    /**
     * scope
     */
    @Test
    public void testEmployee14() {
        Department dept1 = (Department) ac.getBean("dept1");
        Department dept2 = (Department) ac.getBean("dept2");
        System.out.println(dept1==dept2);
    }
}
