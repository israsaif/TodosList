package com.example.Develop.a.Todo.List.Manager.API.Services;

import com.example.Develop.a.Todo.List.Manager.API.Models.UserRegistration;
import com.example.Develop.a.Todo.List.Manager.API.Repositories.UserRegistrationRepositories;
import com.example.Develop.a.Todo.List.Manager.API.RequestObject.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRegistrationServices {
@Autowired
UserRegistrationRepositories userRegistrationRepositories;

    public void addUser(UserRequest userRequest){


        UserRegistration UserRe = new UserRegistration();
        UserRe.setUserName("john");
        UserRe.setPassWord("123");
        userRegistrationRepositories.save(UserRe);

    }


}
