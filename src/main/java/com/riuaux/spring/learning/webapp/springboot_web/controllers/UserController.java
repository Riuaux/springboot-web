package com.riuaux.spring.learning.webapp.springboot_web.controllers;

// import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.riuaux.spring.learning.webapp.springboot_web.models.UserModel;

@Controller
public class UserController {

  @GetMapping("/users")
  public String users(ModelMap model) {
    model.addAttribute("pageTitle", "Conditional display");

    return "users";
  }

  @GetMapping("/details")
  public String details(Model model) {
    UserModel user = new UserModel("Agustin", "Camarena");
    model.addAttribute("user", user);

    model.addAttribute("pageTitle", "Testing Spring");

    return "details";
  }

  @ModelAttribute("users")
  public List<UserModel> someUsers() {
    return Arrays.asList(
        new UserModel("User", "One", "email@example.rnd", "asdf1234"),
        new UserModel("User", "Two"));

  }
}
