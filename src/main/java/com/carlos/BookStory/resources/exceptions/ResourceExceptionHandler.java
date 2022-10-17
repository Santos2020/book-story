package com.carlos.bookstory.resources.exceptions;

import com.carlos.bookstory.services.exceptions.ObjectNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.ServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StandarError> ObjectNotFoundException( ObjectNotFoundException e, ServletRequest request ){
   StandarError error = new StandarError(System.currentTimeMillis(), HttpStatus.NOT_FOUND.value(),e.getMessage());
   return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }
}
