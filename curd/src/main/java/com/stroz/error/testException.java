package com.stroz.error;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndViewDefiningException;

@Controller
public class testException {

	@RequestMapping("calcute")
	public String calcute(@RequestParam("i") Integer i){
		System.out.println(10/i);
		return "success";
	}
	
	
	@RequestMapping("customException")
	public String customException(@RequestParam("i") Integer i){
		if(i==10){
			throw new CustomException();
		}
		System.out.println("customException");
		return "success";
	}
//	@ExceptionHandler({ArithmeticException.class})
//	public ModelAndView handlerArithmeticException(Exception ex){
//		System.out.println("error"+ex);
//		ModelAndView mv=new ModelAndView("error");
//		mv.addObject("exception", ex);
//		return mv;
//	}
//	
//	@ExceptionHandler({RuntimeException.class})
//	public ModelAndView handlerRuntimeException(Exception ex){
//		System.out.println("error"+ex);
//		ModelAndView mv=new ModelAndView("error");
//		mv.addObject("exception", ex);
//		return mv;
//	}
}
