package com.adidyk.service;

import com.adidyk.models.pojo.User;
import com.adidyk.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Interface UserRepository used for access to data base. first day, second day. predicate
 * @author Didyk Andrey (androsdav@gmail.com).
 * @since 25.09.2020.
 * @version 1.0.
 */
@Service
public class UserService {

    /**
     * @param userService - user service.
     */
    private final UserRepository userRepository;

    /**
     * UserService - constructor.
     * @param userRepository - user service.
     */
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * getAllUserByCriteria - gets all user by criteria.
     * @param user - user.
     * @return - return list users by criteria.
     */
    public List<User> getAllUserByCriteria(User user) {
        return this.userRepository.getAllUserByCriteria(user.getFirstName());
    }

}