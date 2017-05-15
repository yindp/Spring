package com.yinom.pdd.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by yindp on 5/15/17.
 */
public class DepartmentAspectLog {
    public void beforeLog(JoinPoint joinPoint) {
        //get target class which add aspect joinPoint
        System.out.println(joinPoint.getTarget().getClass().getName());
        //get Method of target class
        System.out.println(joinPoint.getSignature().getName());
        //get value of parameter
        System.out.println(joinPoint.getArgs()[0]);
        System.out.println(">>>>>log------Start Operation");
    }
    public void afterLog(JoinPoint joinPoint) {
        System.out.println(">>>>>log------End Operation");
    }

    public void aroundLog(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("*******log------Start Operation");
        //get value of return result
        Object result = pjp.proceed();

        System.out.println(result);
        System.out.println("*******log------End Operation");
    }

    public void afterReturnLog(JoinPoint joinPoint) {
        System.out.println("+++++Execute this notice when the method complete");
    }

    public void afterThrowLog(Throwable th) {
        System.out.println("There's  an exception:");
        System.out.println(th.getMessage());
    }
}
