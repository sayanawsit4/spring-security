package com.lnl.security.contants;

public enum MessageDTO {

    //Global
    INVALID_USER_NAME_PWD("User name or password provided is incorrect");

    private final String statusValue;

    MessageDTO(String statusValue) {
        this.statusValue = statusValue;
    }

    @Override
    public String toString() {
        return statusValue;
    }

}