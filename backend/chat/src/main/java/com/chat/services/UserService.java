package com.chat.services;

import com.chat.exceptions.UserAlreadyExistException;
import com.chat.exceptions.UserNotFoundException;
import com.chat.model.User;

import java.util.List;

public interface UserService {
    List<User> getall() throws UserNotFoundException;

    User addUser(User user) throws UserAlreadyExistException;

    User getUserByUserName(String username)  throws UserNotFoundException;
}
