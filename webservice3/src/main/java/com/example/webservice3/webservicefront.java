package com.example.webservice3;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;

public class webservicefront {

    @HystrixCommand(fallbackMethod = "defaultMessage")
    @GetMapping("/")
    public String hello() {
        return "Hello !";
 }
    public String defaultMessage() { return "Salut !";
    }
}
