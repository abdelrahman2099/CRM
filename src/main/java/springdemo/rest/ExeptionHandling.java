package springdemo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExeptionHandling {
	@ExceptionHandler
	public ResponseEntity<ErrorResponse> errorResponse(CustomerNotFoundExption e){
		ErrorResponse error=new ErrorResponse(HttpStatus.NOT_FOUND.value(),
				e.getMessage(),
				(System.currentTimeMillis()));
		return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler
	public ResponseEntity<ErrorResponse> errorResponse(Exception e){
		ErrorResponse error=new ErrorResponse(HttpStatus.BAD_REQUEST.value(),
				e.getMessage(),
				(System.currentTimeMillis()));
		return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
	}
}
