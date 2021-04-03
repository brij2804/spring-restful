package com.brijesh.restful.controller;

import com.brijesh.restful.beans.User;
import com.brijesh.restful.exception.EmptyUserListException;
import com.brijesh.restful.exception.UserCreationException;
import com.brijesh.restful.exception.UserNotFoundException;
import com.brijesh.restful.service.UserDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserDaoService userDaoService;

    @GetMapping("/users")
    public List<User> retrieveAllUsers(){
        if(userDaoService.findAll().size()==0){
            throw new EmptyUserListException("No Users");
        }
          return userDaoService.findAll();
    }

    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id){
        User user =userDaoService.findOne(id);
        if(user==null){
            throw new UserNotFoundException("id- "+id);
        }
        return user;
    }

    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    public User createUser(@Valid @RequestBody User user){
        try {
            if (user.getName() == null || user.getBirthDate() == null) {
                throw new UserCreationException("User creation failed!!");
            }
        }catch(RuntimeException ex){
            throw new UserCreationException("User creation failed!!");
        }
        User newUser=userDaoService.save(user);
        return newUser;
    }

}
