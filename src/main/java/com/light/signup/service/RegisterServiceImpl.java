package com.light.signup.service;

import com.light.signup.entity.Register;
import com.light.signup.repository.RegisterRepository;
import org.hibernate.annotations.NotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotBlank;
import javax.websocket.OnMessage;
import java.util.List;
import java.util.Optional;

@Service
public class RegisterServiceImpl implements RegisterService{
    @Autowired
    private RegisterRepository registerRepository;
    @Override
    public Register saveRegister(Register register) {
        if(registerRepository.findRegisterByEmail(register.getEmail())!=null) throw new RuntimeException("Record already exists");
        return registerRepository.save(register);

    }

    @Override
    public Register fetchRegisterById(int user_id) {
        return registerRepository.findById(user_id).get();
    }

    @Override
    public Register fetchRegisterByName(String name) {
        return registerRepository.findRegisterByName(name);
    }

    @Override
    public Register fetchRegisterByEmail(String email) {
        return registerRepository.findRegisterByEmail(email);
    }

    @Override
    public List<Register> fetchRegisterList() {
        return registerRepository.findAll();
    }



}
