package com.example.secondservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second-service")
@Slf4j
public class SecondService {
  
  @GetMapping("/welcome")
  public String welcome(){
    return "Second!!";
  }
  
  
  @GetMapping("/message")
  public String message(@RequestHeader("second-request") String header){
    log.info(header);
    return "Second Message";
  }
  
  
  @GetMapping("/check")
  public String check(){
    return "Second Check";
  }
}
