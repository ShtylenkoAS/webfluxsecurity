package com.study.webfluxsecurity.exception;

public class AuthException  extends ApiException{
    public AuthException(String massage, String errorCode) {
        super(massage, errorCode);
    }
}
