package sai.service.spring_security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringSecuritycontroller {

    @GetMapping("/dashboard")
    public String getDashboard(){
        return "WelCome All";
    }

    @GetMapping("/user")
    public String getUsers(){
        return "WelCome User";
    }

    @GetMapping("/admin")
    public String getAdmin(){
        return "WelCome Admin";
    }
}
