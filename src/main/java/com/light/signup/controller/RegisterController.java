package com.light.signup.controller;


import com.light.signup.entity.Register;
import com.light.signup.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class RegisterController {
    @Autowired
    private RegisterService registerService;
    @PostMapping("/signup")
    public Register saveRegister(@Valid @RequestBody Register register)
    {
        return registerService.saveRegister(register);
    }
}
