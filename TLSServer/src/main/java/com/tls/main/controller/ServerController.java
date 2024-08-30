package com.tls.main.controller;

import java.time.LocalDateTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {

  @GetMapping("/server")
  public String getMessage() {
    return "Hello ,Welcome!! "+ LocalDateTime.now();
  }
}
