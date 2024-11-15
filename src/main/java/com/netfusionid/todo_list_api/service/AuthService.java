package com.netfusionid.todo_list_api.service;

import org.springframework.http.ResponseEntity;

import com.netfusionid.todo_list_api.dto.LoginDto;
import com.netfusionid.todo_list_api.dto.SignUpDto;

public interface AuthService {
    String login(LoginDto loginDto);
    ResponseEntity<String> signUp(SignUpDto signUpDto);
}
