package com.example.Develop.a.Todo.List.Manager.API.RequestObject;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Data
public class UserRequest {

  private Integer id;
  private String title;
  private String description;
  private Boolean completed;
  private String userName;
}
