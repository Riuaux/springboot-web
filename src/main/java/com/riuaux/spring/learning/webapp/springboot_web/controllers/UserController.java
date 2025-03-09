package com.riuaux.spring.learning.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.riuaux.spring.learning.webapp.springboot_web.models.UserModel;

@Controller
public class UserController {

  @GetMapping("/details")
  public String details(Model model) {
    UserModel user = new UserModel("Agustin", "Camarena");
    model.addAttribute("user", user);

    model.addAttribute("pageTitle", "Testing Spring");

    return "details";
  }
}
