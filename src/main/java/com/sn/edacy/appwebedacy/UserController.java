package com.sn.edacy.appwebedacy;


import com.sn.edacy.appwebedacy.entities.User;
import com.sn.edacy.appwebedacy.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping
    public List<User> getUsers(){

        return userRepository.findAll();

    }


    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public User createUser(@Valid @RequestBody User user){

       return userRepository.save(user);
    }



}
