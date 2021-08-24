package com.wetheasians.api.controller;

import com.wetheasians.api.entity.User;
import com.wetheasians.api.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import sun.security.provider.MD5;

import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * users related inferface
 *
 * @author Joseph Yuanhao Li
 * @date 8/18/21 1:14 AM
 */

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserRepository userRepository;

    public UserController(final UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @GetMapping()
    public Iterable<User> getAllUser(){
        return this.userRepository.findAll();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") Integer id){
        Optional<User> userOptional = this.userRepository.findById(id);
        if(!userOptional.isPresent()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "The id doesn't exist.");
        }


        return userOptional.get();
    }

    @PostMapping()
    public User createUser(@RequestParam String email, @RequestParam String password){
        System.out.println(email + ", " + password);
        User user = User.builder()
                .email(email)
                .password(password)
                .createAt(new Date())
                .build(); //new User();
        return this.userRepository.save(user);
    }
}
