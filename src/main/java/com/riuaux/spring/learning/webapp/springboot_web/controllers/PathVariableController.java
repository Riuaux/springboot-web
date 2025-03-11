package com.riuaux.spring.learning.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.riuaux.spring.learning.webapp.springboot_web.models.UserModel;
import com.riuaux.spring.learning.webapp.springboot_web.models.dtos.ParamDto;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api")
public class PathVariableController {

  @GetMapping("/variable/{msg}")
  /**
   * ? Both "String msg" and ".../{msg}" must be equal named, consider this also
   * ? when "naming" the "PathVariable()"
   */
  public ParamDto variable(@PathVariable String msg) {

    ParamDto paramDto = new ParamDto();
    paramDto.setMessage(msg);

    return paramDto;
  }

  @GetMapping("/mix/{product}/{id}")
  public Map<String, Object> mixPathVar(
      @PathVariable String product,
      @PathVariable Long id) {

    Map<String, Object> jsonData = new HashMap<>();
    jsonData.put("product", product);
    jsonData.put("id", id);

    return jsonData;
  }

  // ^ Post

  @PostMapping("/user/create")
  public UserModel creatUserModel(@RequestBody UserModel user) {

    // ? Tinker with the data...
    user.setPassword(user.getPassword().toUpperCase());

    return user;
  }

}
