package com.tck.Conference.controller;

import com.tck.Conference.model.Registration;
import com.tck.Conference.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    //This is store data inside object.
    //Alternatively, a database call can be done here.
    @GetMapping("/user")
    public User getUser(@RequestParam(value="firstName", defaultValue ="Caner" )String firstName,
                        @RequestParam(value="lastName", defaultValue ="Komur" )String lastName,
                        @RequestParam(value="age", defaultValue ="23" ) int age){
        User user = new User();

        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setAge(age);

        return user;
    }

    @PostMapping("/user")
    public User postUser(User user){
        //This can be expanded by adding validation
        System.out.println("User first name: "+ user.getFirstName()
                            +"User last name: " + user.getLastName()
                            +"User age: "+user.getAge());
        return user;
    }
}
