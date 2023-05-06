package com.vote_application.voteapp.service;
import com.vote_application.voteapp.model.User;
import com.vote_application.voteapp.repository.UserRepository;
import com.vote_application.voteapp.web.dto.UserRegistrationDto;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;


    public UserServiceImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegistrationDto registrationDto) {
        User user = new User(registrationDto.getVin(), registrationDto.getFirstName(),
                registrationDto.getLastName(), registrationDto.getPhoneNumber(), registrationDto.getPassword());

        return userRepository.save(user);
    }



}