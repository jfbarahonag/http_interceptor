package com.jfbarahonag.springboot.interceptor.http_interceptor.controllers;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/categories")
public class CategoriesController {

  @GetMapping("/foo")
  public Map<String, String> foo() {

    return Collections.singletonMap("message", "Foo handler of categories controller");

  }
  
  @GetMapping("/bar")
  public Map<String, String> bar() {

    return Collections.singletonMap("message", "Bar handler of categories controller");

  }
  
  @GetMapping("/baz")
  public Map<String, String> baz() {

    return Collections.singletonMap("message", "Baz handler of categories controller");

  }

}
