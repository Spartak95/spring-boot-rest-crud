package com.spring.exception_handling;

public class NoSuchProductException extends Exception {

    public NoSuchProductException(String message) {
        super(message);
    }

}
