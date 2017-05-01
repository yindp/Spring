package com.yinom.pdd.spring.factory;

import com.yinom.pdd.spring.model.Employee;

/**
 * Created by yindp on 5/1/17.
 */
public class EmployeeFactory {
    /**
     * new an Employee
     */
    public Employee createEmployee() {
        Employee emp = new Employee(5, "Eas", 99);
        return emp;
    }
    /**
     * Static Factory new an Employee
     */
    public static Employee createEmployeeStatic() {

        Employee emp = new Employee(6, "Ild", 55);
        return emp;
    }
}
