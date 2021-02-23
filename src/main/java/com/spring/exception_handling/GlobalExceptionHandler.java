package com.spring.exception_handling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    // @ExceptionHandler աննոտացիայով նշված մեթոդըը պատասխանատու է բացառության մշակման համար
    @ExceptionHandler
    public ResponseEntity<ProductIncorrectData> handlerException(NoSuchProductException exception) {
        ProductIncorrectData data = new ProductIncorrectData();
        data.setInfo(exception.getMessage());
        return new ResponseEntity<>(data, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<ProductIncorrectData> handlerException(Exception exception) {
        ProductIncorrectData data = new ProductIncorrectData();
        data.setInfo(exception.getMessage());
        return new ResponseEntity<>(data, HttpStatus.BAD_REQUEST);
    }
}
