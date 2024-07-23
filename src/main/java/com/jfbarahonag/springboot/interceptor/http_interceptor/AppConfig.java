package com.jfbarahonag.springboot.interceptor.http_interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppConfig implements WebMvcConfigurer {

  @Autowired
  @Qualifier("ltInterceptor")
  private HandlerInterceptor timeInterceptor;

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    // registry.addInterceptor(timeInterceptor).addPathPatterns("/api/v1/parameters/bar");
    registry.addInterceptor(timeInterceptor)
        .addPathPatterns("/**/parameters/*")
        .excludePathPatterns("/**/foo");
  }

}
