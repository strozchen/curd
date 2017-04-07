package com.stroz.error;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class HandlerException {
	
	@ExceptionHandler({ArithmeticException.class})
	public ModelAndView handlerArithmeticException(Exception ex){
		System.out.println("ArithmeticException error"+ex);
		ModelAndView mv=new ModelAndView("error");
		mv.addObject("exception", ex);
		return mv;
	}
	
	@ExceptionHandler({RuntimeException.class})
	public ModelAndView handlerRuntimeException(Exception ex){
		System.out.println("RuntimeException error"+ex);
		ModelAndView mv=new ModelAndView("error");
		mv.addObject("exception", ex);
		return mv;
	}
}
