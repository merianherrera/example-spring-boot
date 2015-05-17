package example.controllers;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UserController {
    
    @RequestMapping(value = "/user", method = RequestMethod.POST )
    public String index() {
        return "Greetings from Spring Boot, User Controller!";
    }
    
}
