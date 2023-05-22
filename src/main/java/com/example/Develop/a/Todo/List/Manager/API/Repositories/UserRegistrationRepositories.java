package com.example.Develop.a.Todo.List.Manager.API.Repositories;

import com.example.Develop.a.Todo.List.Manager.API.Models.UserRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRegistrationRepositories extends JpaRepository<UserRegistration,Integer> {

@Query(value = "SELECT id from user_registration WHERE user_name= :userName",nativeQuery = true)
    Integer getIdByUserName(@Param("userName") String userName);
}
