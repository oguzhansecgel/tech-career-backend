package com.oguzhansecgel.techcareer_backend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CREATED)
public class _201_CreatedException extends RuntimeException{

    public _201_CreatedException(String message) {
        super(message);
    }
}
