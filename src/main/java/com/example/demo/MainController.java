package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class EmployeeController {

  @GetMapping("/employees")
  String all() {
    return "Hello World";
  }
}
