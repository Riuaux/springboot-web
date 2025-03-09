package com.riuaux.spring.learning.webapp.springboot_web.models;

public class UserModel {

  private String firstName;
  private String lastName;
  private String email;
  private String password;

  public UserModel() {
  }

  public UserModel(String firstName, String lastName, String email, String password) {
    this(firstName, lastName);
    this.email = email;
    this.password = password;
  }

  public UserModel(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

}
