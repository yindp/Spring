package com.yinom.pdd.spring.service;

/**
 * Created by yindp on 5/15/17.
 */
public class DepartmentServiceImpl implements DepartmentService{

    public void addDept(String name) {
        //System.out.println(">>>>>log------Add");
        System.out.println("Add a department : "+name);
        System.out.println(10/0);
        //System.out.println(">>>>>log------End");

    }

    public void updateDept(String name) {
        System.out.println("Update department : "+name);
    }
}
