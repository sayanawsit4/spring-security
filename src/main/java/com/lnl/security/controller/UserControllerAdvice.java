package com.lnl.security.controller;

import com.lnl.security.contants.MessageDTO;
import com.lnl.security.exception.InvalidUserNamePasswordException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class UserControllerAdvice {

    @Autowired
    private HttpServletRequest request;


    @ExceptionHandler({InvalidUserNamePasswordException.class})
    public ResponseEntity handleInvalidAccessToken(InvalidUserNamePasswordException e) {
        return new ResponseEntity<>(MessageDTO.INVALID_USER_NAME_PWD.toString(),
                HttpStatus.UNAUTHORIZED);
    }
}