package com.demo.exception_handling_enesb.controller;

import com.demo.exception_handling_enesb.entity.RootEntity;

public class BaseController {

    public <T> RootEntity<T> ok(T data) {
        return RootEntity.ok(data);
    }

    public <T> RootEntity<T> error(String errorMessage) {
        return RootEntity.error(errorMessage);
    }

}
