//package com.example.Develop.a.Todo.List.Manager.API.Controller;

import com.example.Develop.a.Todo.List.Manager.API.Models.Todo;
import com.example.Develop.a.Todo.List.Manager.API.Repositories.TodoRepositories;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
//@SpringBootTest
//class TodoControllerTest {
//@Autowired
//TodoController todoController;
//    @Autowired
//    private TodoRepositories todoRepositories;
//
////    @Test
////     void getTodoById() {
////        Todo todo = new Todo();
////      List<Todo> ByIdTest=todoController.getTodoById(4);
////        String title= todo.getTitle();
////        assertNotNull(ByIdTest);
////        assertEquals();
////        assertEquals("Registration",title);
////        assertNotEquals("since",title);
////
////    }
//    @Test
//    void getTodoById() {
//        List<Todo> getByIdTest = todoController.getTodoById(3);
//        assertEquals(3, getByIdTest);
//        assertNotEquals(6,getByIdTest);
//
//    }
//
//}