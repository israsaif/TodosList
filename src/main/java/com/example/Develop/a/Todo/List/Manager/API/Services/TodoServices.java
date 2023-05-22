package com.example.Develop.a.Todo.List.Manager.API.Services;



import com.example.Develop.a.Todo.List.Manager.API.Models.Todo;
import com.example.Develop.a.Todo.List.Manager.API.Models.UserRegistration;
import com.example.Develop.a.Todo.List.Manager.API.Repositories.TodoRepositories;

import com.example.Develop.a.Todo.List.Manager.API.Repositories.UserRegistrationRepositories;
import com.example.Develop.a.Todo.List.Manager.API.RequestObject.PayloadRequest;
import com.example.Develop.a.Todo.List.Manager.API.RequestObject.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class TodoServices {
    @Autowired
    TodoRepositories todoRepositories;

    @Autowired
    UserRegistrationRepositories userRegistration;

    public void TodoCreation(UserRequest userRequest) {
        Todo todoR = new Todo();
//        UserRegistration userRegistration = new UserRegistration();
        todoR.setTitle(userRequest.getTitle());
        todoR.setDescription(userRequest.getDescription());
//        TodoR.setUserRegistration(userRegistration);
        todoR.setCompleted(true);
        todoRepositories.save(todoR);

    }


//    public String getTodo(Integer TodoId) {
//        Todo todo = todoRepositories.findById(TodoId).get();
//        UserRegistration userRegistration = todo.getUserRegistration();
//
//
//        String getTodo = "getTodo Of todo :" + todo.getUserRegistration() +
//                "\n Todo Title :" + todo.getTitle() +
//                "\n Todo Completed :" + todo.getCompleted() +
//                "\n Todo Description :" + todo.getDescription();
//        return getTodo;
//    }


    public List<Todo> getTodoById(Integer id) {
        return todoRepositories.findAllById(id);
    }


    public void updateTodo(UserRequest userRequest) {
        Todo TodoR = new Todo();
        TodoR.setId(userRequest.getId());
        TodoR.setTitle(userRequest.getTitle());
        TodoR.setDescription(userRequest.getDescription());
        Integer id = userRegistration.getIdByUserName(userRequest.getUserName());
        UserRegistration userRegistrationId = userRegistration.findById(id).get();
        TodoR.setUserRegistration(userRegistrationId);
        TodoR.setCompleted(userRequest.getCompleted());
        todoRepositories.save(TodoR);

    }
//    public void deleteTodoById(Integer id) {
//        Todo todo = todoRepositories.deleteById(id).get();
//        todoRepositories.save(todo);
//    }
}