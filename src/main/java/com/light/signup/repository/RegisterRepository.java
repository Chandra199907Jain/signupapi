package com.light.signup.repository;


import com.light.signup.entity.Register;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RegisterRepository extends JpaRepository<Register,Integer> {
     public Register findRegisterByName(String name);
     public Register findRegisterByEmail(String email);

}
