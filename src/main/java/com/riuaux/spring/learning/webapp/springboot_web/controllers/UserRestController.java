package com.riuaux.spring.learning.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.riuaux.spring.learning.webapp.springboot_web.models.UserDTO;
import com.riuaux.spring.learning.webapp.springboot_web.models.UserModel;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
public class UserRestController {

  @GetMapping("/details")
  public Map<String, Object> userDetails() {
    UserModel user = new UserModel("Agustin", "Camarena");
    Map<String, Object> responseBody = new HashMap<>();

    responseBody.put("user", user);

    return responseBody;
  }

  @GetMapping("/details-dto")
  public UserDTO userDetailsDTO() {
    UserModel user = new UserModel("Agustin", "Camarena");
    UserDTO userDTO = new UserDTO("User via DTO", user);

    return userDTO;
  }

}
