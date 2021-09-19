package com.andre.jwtrefreshtoken.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/secrured")
public class SecuredResource {
    @GetMapping("/data")
    public String allAccess(){
        return "secured resource";
    }
}
