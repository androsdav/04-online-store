package com.adidyk.controller;

import com.adidyk.models.pojo.User;
import com.adidyk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Interface UserRepository used for access to data base. first day, second day. predicate
 * @author Didyk Andrey (androsdav@gmail.com).
 * @since 25.09.2020.
 * @version 1.0.
 */
@RestController
public class UserController {

    /**
     * @param userService - user service.
     */
    private final UserService userService;

    /**
     * UserController - constructor.
     * @param userService - user service.
     */
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * findAllUser - finds and returns list user.
     * @return - returns list user.
     */
    @RequestMapping(value = "/find_all_user", method = RequestMethod.POST)
    public ResponseEntity<List<User>> findAllUser(@RequestBody User user) {
        return new ResponseEntity<>(this.userService.getAllUserByCriteria(user), HttpStatus.OK);
    }

}
