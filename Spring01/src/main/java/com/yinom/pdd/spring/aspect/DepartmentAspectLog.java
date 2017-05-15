package com.yinom.pdd.spring.aspect;

import org.aspectj.lang.JoinPoint;

/**
 * Created by yindp on 5/15/17.
 */
public class DepartmentAspectLog {
    public void beforeLog(JoinPoint joinPoint) {
        System.out.println(">>>>>log------Add");
    }
}
