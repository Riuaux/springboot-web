package com.riuaux.spring.learning.webapp.springboot_web.models.dtos;

public class ParamDto {

  private String message;
  private Integer code;

  // public ParamDto(String message, Integer code) {
  // this.message = message;
  // this.code = code;
  // }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

}
