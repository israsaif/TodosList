package com.example.Develop.a.Todo.List.Manager.API.Controller;

import com.example.Develop.a.Todo.List.Manager.API.Models.Todo;
import com.example.Develop.a.Todo.List.Manager.API.Repositories.TodoRepositories;
import com.example.Develop.a.Todo.List.Manager.API.RequestObject.PayloadRequest;
import com.example.Develop.a.Todo.List.Manager.API.RequestObject.UserRequest;
import com.example.Develop.a.Todo.List.Manager.API.Services.TodoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "Todo")
public class TodoController {
    @Autowired
    TodoServices todoServices;

    @RequestMapping(value = "Todoinsert", method = RequestMethod.POST)
    public String TodoCreation(@RequestBody UserRequest userRequest) {
        try {
            todoServices.TodoCreation(userRequest);
            return "  201 Created  ";
        } catch (Exception e) {
            return "TodoCreation  Failed";
        }


    }

    @RequestMapping(value = "getTodoById", method = RequestMethod.GET)
    public List<Todo> getTodoById(@RequestParam Integer id) {
        return todoServices.getTodoById(id);
    }

    //    @RequestMapping(value = "getTodo", method = RequestMethod.GET)
//    public ResponseEntity<String> getTodo(@RequestParam Integer TodoId) {
//        String statement = todoServices.getTodo(TodoId);
//        return ResponseEntity.ok(statement);
//    }
    @RequestMapping(value = "/updateTodo", method = RequestMethod.GET)
    public String updateTodo(@RequestParam UserRequest userRequest) {
        todoServices.updateTodo(userRequest);

        return " 200 OK ";
    }
//    @RequestMapping(value = "/deleteTodoById", method = RequestMethod.POST)
//    public String deleteTodoById(Integer id) {
//        try {
//            todoServices.deleteTodoById(id);
//        } catch (Exception e) {
//            return "204 No Content ";
//        }
//      return "Deleted Successfully :)";
//    }
        }
