package com.yinom.pdd.spring.test;

import com.yinom.pdd.spring.service.DepartmentService;
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
    public void test01() {
        DepartmentService ds = (DepartmentService) ac.getBean("departmentService");
        ds.addDept("Head Office");
    }
}
