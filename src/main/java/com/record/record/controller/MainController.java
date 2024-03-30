package com.record.record.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.record.record.service.MainService;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class MainController {

  @Autowired
  MainService service;

  @GetMapping("service")
  public String getMethodName() {
    return String.valueOf(service.execute());
  }
  
}
