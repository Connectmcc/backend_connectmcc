package com.mcc.connectMcc.exceptions;

import java.time.LocalDate;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptions {
	@ExceptionHandler(UserException.class)
   public ResponseEntity<ErrorDetails> UserExceptionHandler(UserException ue, WebRequest req){
		
		ErrorDetails err=new ErrorDetails(ue.getMessage(), req.getDescription(false),LocalDate.now());
		
	   return null;
   }
}
