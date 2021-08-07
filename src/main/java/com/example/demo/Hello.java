  
package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Hello {

  @GetMapping("/")
  String all() {
    return "Hello Uzeen Singh! I am from pipeline commit";
  }

  @GetMapping("/{name}")
  String allByName(@PathVariable("name") String name) {
    return "Hello "+name;
  }
}
