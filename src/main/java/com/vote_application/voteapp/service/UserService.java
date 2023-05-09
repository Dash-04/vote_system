package com.vote_application.voteapp.service;

import com.vote_application.voteapp.model.User;
import com.vote_application.voteapp.web.dto.UserRegistrationDto;

import java.util.List;


public interface UserService {
        List<User> getAllUser();
        void save(User user);
        User getById(Long id);
        void deleteViaId(long id);


}
