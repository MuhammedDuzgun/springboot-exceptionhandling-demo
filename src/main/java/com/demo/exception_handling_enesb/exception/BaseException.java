package com.demo.exception_handling_enesb.exception;

public class BaseException extends RuntimeException {

    public BaseException() {
    }

    public BaseException(ErrorMessage message) {
        super(message.prepareErrorMessage());
    }

}
