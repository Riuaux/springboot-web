package com.riuaux.spring.learning.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.riuaux.spring.learning.webapp.springboot_web.models.dtos.ParamDto;
import com.riuaux.spring.learning.webapp.springboot_web.models.dtos.ParamMixDto;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/params")
public class RequestParamsController {

  @GetMapping("/foo")
  public ParamDto foo(
      /**
       * ? This param "String message" must be named exactly as in the property in
       * ? "ParamDto class" if "name" param in "@RequestParam()" is not defined, said
       * ? "name" is the required name on the URL if actually defined.
       */
      @RequestParam(required = false, defaultValue = "Not message set!", name = "mensaje") String message) {

    ParamDto paramDto = new ParamDto();
    paramDto.setMessage(message.trim());

    return paramDto;
  }

  @GetMapping("/bar")
  public ParamDto bar(@RequestParam String text, @RequestParam Integer code) {

    ParamDto paramsDto = new ParamDto();
    paramsDto.setMessage(text.trim());
    paramsDto.setCode(code);

    return paramsDto;
  }

  @GetMapping("/request")
  public ParamMixDto request(
      HttpServletRequest request) {

    // ? Simple validation
    Integer code = 0;
    try {
      code = Integer.parseInt(request.getParameter("code"));
    } catch (NumberFormatException e) {
      // TODO: handle exception
    }

    ParamMixDto paramsDto = new ParamMixDto();
    paramsDto.setMessage(request.getParameter("text"));
    paramsDto.setCode(code);

    return paramsDto;
  }

}
