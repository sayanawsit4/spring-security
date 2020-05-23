package com.lnl.security.exception;

import com.lnl.security.contants.MessageDTO;

public class InvalidUserNamePasswordException extends RuntimeException {
    public InvalidUserNamePasswordException(MessageDTO msg) {
        super(msg.toString());
    }
}
