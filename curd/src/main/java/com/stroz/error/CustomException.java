package com.stroz.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.BAD_GATEWAY,reason="自定义错误原因")
public class CustomException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
