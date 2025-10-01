package com.mehedi.blooddonation.modules.user.service;

import com.mehedi.blooddonation.modules.auth.model.User;
import com.mehedi.blooddonation.modules.auth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
