package com.light.signup.entity;

import org.hibernate.validator.constraints.Length;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Entity
public class Register {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int user_id;
    @NotBlank(message = "Please add a name")
    @Pattern(regexp = "^[a-zA-Z]*$",message="Name should only contain alphabets")
    private String name;
    @NotBlank(message = "Please enter your email address")
    @Pattern(regexp="^(.+)@(.+)$",message="Enter a valid email address")
    private String email;
    @NotBlank(message = "Please enter a suitable username")
    @Pattern(regexp="^[a-zA-Z0-9]*$",message="Username should only be alphanumeric")
    @Length(min=5,max=8)
    private String username;
    @NotBlank(message="Please add a suitable password")
    @Length(min=8,max=16)
    private String password;
    @NotBlank(message ="Please enter a company name")
    @Pattern(regexp = "^[a-zA-Z]*$",message="Company name should only contain alphabets")
    private String company;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Register(int user_id,String name,String username,String email,String password,String company) {
        this.user_id = user_id;
        this.name=name;
        this.username=username;
        this.email=email;
        this.password=password;
        this.company=company;
    }

    public Register() {
    }

    @Override
    public String toString() {
        return "Register{" +
                "user_id=" + user_id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

}
