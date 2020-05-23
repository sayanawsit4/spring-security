package com.lnl.security.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @PreAuthorize("hasRole('USER')")
    @GetMapping(value = "/")
    public String getUserDetails(@AuthenticationPrincipal User user) {
        return "Welcome User " + user.toString();
    }
}
