package com.riuaux.spring.learning.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

  @GetMapping("/details")
  public String details(Model model) {
    model.addAttribute("pageTitle", "Testing Spring");
    model.addAttribute("firstName", "Agustin");
    model.addAttribute("lastName", "Camarena");

    return "details";
  }
}
