package com.demo.exception_handling_enesb.exceptionhandler;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiError<E>{
    private Integer status;
    private Exception<E> exception;
}
