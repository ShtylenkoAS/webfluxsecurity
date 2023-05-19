package com.study.webfluxsecurity.exception;

import lombok.Getter;

public class ApiException extends RuntimeException{

    @Getter
    private String errorCode;

    public ApiException(String massage, String errorCode) {
        super(massage);
        this.errorCode = errorCode;
    }
}
