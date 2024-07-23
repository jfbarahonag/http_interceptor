package com.jfbarahonag.springboot.interceptor.http_interceptor.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/v1/parameters")
public class ParameterController {
  
  @GetMapping("/foo")
  public Map<String, String> foo() {

    return Collections.singletonMap("message", "Foo handler of controller");

  }
  
  @GetMapping("/bar")
  public Map<String, String> bar() {

    return Collections.singletonMap("message", "Bar handler of controller");

  }
  
}
