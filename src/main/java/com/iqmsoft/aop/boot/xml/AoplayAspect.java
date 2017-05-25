package com.iqmsoft.aop.boot.xml;

import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class AoplayAspect {
	
    Logger logger = LoggerFactory.getLogger(AoplayAspect.class);

    public void beforeRequest(JoinPoint joinPoint){
        logger.info("Doing something before controller execution");
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        logger.info("Called method '{}' with parameter '{}'", name, args);

    }
    
    public void afterRequest(JoinPoint joinPoint){
        logger.info("Doing something after controller execution");
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        logger.info("Called method '{}' with parameter '{}'", name, args);

    }
    
    public void aroundRequest(JoinPoint joinPoint){
        logger.info("Doing something around controller execution");
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        logger.info("Called method '{}' with parameter '{}'", name, args);

    }
    

    public void afterReturning(JoinPoint joinPoint, Object retVal){
        logger.info("Doing something after controller return");
        String name = joinPoint.getSignature().getName();
        logger.info("Controller method '{}' returned '{}'", name, retVal);
    }

    public void afterThrowing(Exception ex){
        System.out.println("after throwing...");
    }
}
