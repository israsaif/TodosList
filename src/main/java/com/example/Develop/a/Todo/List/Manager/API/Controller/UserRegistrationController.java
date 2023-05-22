package com.example.Develop.a.Todo.List.Manager.API.Controller;

import com.example.Develop.a.Todo.List.Manager.API.Models.UserRegistration;
import com.example.Develop.a.Todo.List.Manager.API.RequestObject.UserRequest;
import com.example.Develop.a.Todo.List.Manager.API.Services.UserRegistrationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "User")
public class UserRegistrationController {

    @Autowired
    UserRegistrationServices userRegistrationServices;


    @RequestMapping(value = "addUser", method = RequestMethod.POST)
    public String addUser(@RequestBody UserRequest userRequest) {
        try {
            userRegistrationServices.addUser(userRequest);
            return "addUser added  200 OK ";
        } catch (Exception e) {
            return "addUser added Failed";
        }


    }
}
