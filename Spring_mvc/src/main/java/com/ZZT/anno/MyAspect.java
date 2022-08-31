package com.ZZT.anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component("My_anno_aop")
@Aspect
public class MyAspect {

    //定义切点表达式
    @Pointcut("execution(* com.ZZT.anno.*.*(..))")
    public void pointcut(){}

    //配置前置增强
    @Before("execution(* com.ZZT.anno.*.*(..))")
    public void before(){
        System.out.println("我是前置");
    }

    @AfterReturning("pointcut()")
    public void after_running(){
        System.out.println("我是后置");
    }


    //@Around("pointcut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("我是环绕前增强");
        //切点方法
        Object proceed = joinPoint.proceed();
        System.out.println("我是环绕后增强");
        return proceed;
    }

    @AfterThrowing("pointcut()")
    public void after_throwing(){
        System.out.println("我是异常抛出增强");
    }

    @After("pointcut()")
    public void after(){
        System.out.println("我是最终增强");
    }


}
