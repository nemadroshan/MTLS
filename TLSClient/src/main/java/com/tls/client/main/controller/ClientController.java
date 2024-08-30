package com.tls.client.main.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClientController {
  @Autowired
  private RestTemplate template;
  
  @GetMapping("/client")
  public String getMessage() {
    try {
      String url = null;
      //url = "http://localhost:8082/server";
       url = "https://localhost:8082/server";
      return template.getForObject(url, String.class);
    } catch (Exception e) {
      // TODO: handle exception
      e.printStackTrace();
      return e.getMessage();
    }
  }
}
