package com.light.signup.controller;


import com.light.signup.entity.Register;
import com.light.signup.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController

public class RegisterController {
    @Autowired
    private RegisterService registerService;
    @PostMapping("/signup")
    public Register saveRegister(@Valid @RequestBody Register register)
    {


            return registerService.saveRegister(register);
    }
    @GetMapping("/signup")
    public List<Register> fetchDepartmentList()
    {
        return registerService.fetchRegisterList();
    }
    @GetMapping("/signup/{id}")
    public Register RegisterById(@PathVariable("id") int user_id)
    {
        return registerService.fetchRegisterById(user_id);
    }
    @GetMapping("/signup/name/{name}")
    public Register fetchRegisterByName(@PathVariable("name") String name)
    {
        return registerService.fetchRegisterByName(name);
    }
    @GetMapping("/signup/email/{email}")
    public Register fetchRegisterByEmail(@PathVariable("email") String email)
    {
        return registerService.fetchRegisterByEmail(email);
    }
}
