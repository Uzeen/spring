  
package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Hello {

  @GetMapping("/")
  String all() {
    return "Hello nonu Singh! I am from pipeline commit new changes";
  }

  @GetMapping("/{name}")
  String allByName(@PathVariable("name") String name) {
    return "Hello "+name;
  }
}
