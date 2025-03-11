package com.riuaux.spring.learning.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.riuaux.spring.learning.webapp.springboot_web.models.dtos.ParamDto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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

}
