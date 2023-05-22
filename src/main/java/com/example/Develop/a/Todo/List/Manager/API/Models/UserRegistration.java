package com.example.Develop.a.Todo.List.Manager.API.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Setter
@Getter
public class UserRegistration {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer id;
    private String userName;
    private  String passWord;


}
