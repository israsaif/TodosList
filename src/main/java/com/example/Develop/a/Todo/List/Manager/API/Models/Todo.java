package com.example.Develop.a.Todo.List.Manager.API.Models;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;

@Entity
@Setter
@Getter
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String description;
    private Boolean completed;


    @ManyToOne
    @JoinColumn(name = "userRegistrationId", referencedColumnName = "id")
    UserRegistration userRegistration;
}