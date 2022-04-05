package com.light.signup.service;

import com.light.signup.entity.Register;
import com.light.signup.repository.RegisterRepository;
import org.hibernate.annotations.NotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotBlank;
import javax.websocket.OnMessage;

@Service
public class RegisterServiceImpl implements RegisterService{
    @Autowired
    private RegisterRepository registerRepository;
    @Override
    public Register saveRegister(Register register) {
//        String users = register.getPassword();
//        int len = users.length();
//        if (len >= 8 && len <= 16) {
//            return registerRepository.save(register);
//        }
//        else
//        {
        return registerRepository.save(register);

    }
}
