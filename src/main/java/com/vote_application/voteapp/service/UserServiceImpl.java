package com.vote_application.voteapp.service;
import com.vote_application.voteapp.model.User;
import com.vote_application.voteapp.repository.UserRepository;
import com.vote_application.voteapp.web.dto.UserRegistrationDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUser()
    {
        return userRepository.findAll();
    }

    @Override
    public void save(User user)
    {
        userRepository.save(user);
    }

    @Override
    public User getById(Long id)
    {
        Optional<User> optional = userRepository.findById(id);
        User user = null;
        if (optional.isPresent())
            user = optional.get();
        else
            throw new RuntimeException(
                    "User not found for id : " + id);
        return user;
    }

    @Override
    public void deleteViaId(long id)
    {
        userRepository.deleteById(id);
    }



}