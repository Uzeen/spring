

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Hello {

  @GetMapping("/")
  String all() {
    return "Hello Uzeen Singh!"
  }
}
