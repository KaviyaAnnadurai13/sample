package com.dealer.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class Globalexceptionhandler {
  @ExceptionHandler(value=Namenotfound.class)
  public ResponseEntity<Object> noname(Namenotfound mn){
  return new ResponseEntity<>(mn.getMessage(),HttpStatus.NOT_FOUND);
}
}