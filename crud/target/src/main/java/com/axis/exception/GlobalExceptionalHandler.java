//package com.axis.exception;
//
//import java.time.LocalDateTime;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//
//
////global exception handling
//@RestControllerAdvice
//public class GlobalExceptionalHandler {
//
//	
//	@ExceptionHandler(UsnNotFoundException.class)
//	public ResponseEntity<ErrorInfo> noIdFound(UsnNotFoundException exception)
//	{
//		ErrorInfo errorInfo = new ErrorInfo();
//		errorInfo.setErrorMessage(exception.getMsg());
//		errorInfo.setHttpStatus(HttpStatus.NOT_FOUND.toString());
//		errorInfo.setDateTime(LocalDateTime.now());
//		
//		return new ResponseEntity<ErrorInfo>(errorInfo, HttpStatus.NOT_FOUND);
//	}
//	
//	
//	@ExceptionHandler(InvalidSemException.class)
//	public ResponseEntity<ErrorInfo> invaliPrice(InvalidSemException exception)
//	{
//		ErrorInfo errorInfo = new ErrorInfo();
//		errorInfo.setErrorMessage(exception.getMsg());
//		errorInfo.setHttpStatus(HttpStatus.BAD_REQUEST.toString());
//		errorInfo.setDateTime(LocalDateTime.now());
//		
//		return new ResponseEntity<ErrorInfo>(errorInfo, HttpStatus.BAD_REQUEST);
//	}
//	
//	
//}
