package com.ZZT.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
    public void before(){
        System.out.println("我是前置");
    }

    public void after_running(){
        System.out.println("我是后置");
    }

    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("我是环绕前增强");
        //切点方法
        Object proceed = joinPoint.proceed();
        System.out.println("我是环绕后增强");
        return proceed;
    }

    public void after_throwing(){
        System.out.println("我是异常抛出增强");
    }

    public void after(){
        System.out.println("我是最终增强");
    }


}
