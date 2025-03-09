package com.riuaux.spring.learning.webapp.springboot_web.models;

public class UserDTO {

  private String title;
  private UserModel user;

  public UserDTO(String title, UserModel user) {
    this.title = title;
    this.user = user;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public UserModel getUser() {
    return user;
  }

  public void setUser(UserModel user) {
    this.user = user;
  }

}
