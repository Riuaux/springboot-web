package com.riuaux.spring.learning.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
public class UserRestController {

  @GetMapping("/details")
  public Map<String, Object> getJSON() {
    Map<String, Object> responseBody = new HashMap<>();
    responseBody.put("pageTitle", "Testing Spring");
    responseBody.put("firstName", "Agustin");
    responseBody.put("lastName", "Camarena");

    return responseBody;
  }

}
