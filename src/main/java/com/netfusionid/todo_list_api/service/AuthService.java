package com.netfusionid.todo_list_api.service;

import com.netfusionid.todo_list_api.dto.LoginDto;

public interface AuthService {
    String login(LoginDto loginDto);
}
