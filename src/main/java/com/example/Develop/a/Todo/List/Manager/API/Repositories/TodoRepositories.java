package com.example.Develop.a.Todo.List.Manager.API.Repositories;

import com.example.Develop.a.Todo.List.Manager.API.Models.Todo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepositories extends JpaRepository<Todo,Integer> {

    @Query(value = "SELECT id FROM user WHERE user = :user", nativeQuery = true)
    Integer findIdByUser(@Param("user") String user);

    List<Todo> findAllById(Integer id);

    @Query("SELECT to from Todo to")

    List<Todo> getAllTodo();


}
