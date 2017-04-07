package com.stroz.aspectJ;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class AspectAction {
	@Pointcut(value="execution( * com.stroz.DAO.DAO.* (..))")
	public void aspectAction(){
		
	}
	
	@Before(value="aspectAction()")
	public void beforeAction(){
		System.out.println("before action");
	}
	
	@Around(value="aspectAction()")
	public void aroundAction(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("around-beofre action");

			Object retVal=pjp.proceed();

		System.out.println("around-after action");
	}
	
	@After(value="aspectAction()")
	public void afterAction(){
		System.out.println("after action");
	}
	
	@AfterReturning(value="aspectAction()")
	public void retrunAction(){
		System.out.println("after retruning action");
	}
	
	@AfterThrowing(value="aspectAction()")
	public void throwingAction(){
		System.out.println("after throwing action");
	}
}
