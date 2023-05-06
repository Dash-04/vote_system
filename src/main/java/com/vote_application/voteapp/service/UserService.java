package com.vote_application.voteapp.service;

import com.vote_application.voteapp.model.User;
import com.vote_application.voteapp.web.dto.UserRegistrationDto;


public interface UserService {
        User save(UserRegistrationDto registrationDto);


}
