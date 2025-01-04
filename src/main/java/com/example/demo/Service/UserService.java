package com.example.demo.Service;

import com.example.demo.DTO.UserDto;
import com.example.demo.Model.RegistrationRequest;
import com.example.demo.Model.User;

import java.util.List;

public interface UserService {
    boolean checkEmail(String email);

    UserDto registerUser(RegistrationRequest registrationRequest);

    UserDto getLoginUser();

    UserDto getUserById(Integer id);

    List<UserDto> getAllUsers();

    UserDto createUser(User user);

    UserDto updateUser(User user);

    void deleteUser(User user);
}
