package com.light.signup.service;

import com.light.signup.entity.Register;

import java.util.List;

public interface RegisterService {
    public Register saveRegister(Register register);


    public Register fetchRegisterById(int user_id);

    public Register fetchRegisterByName(String name);

   public Register fetchRegisterByEmail(String email);


   public List<Register> fetchRegisterList();



}
