package example.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController2 {
    
    @RequestMapping(value = "/user2", method = RequestMethod.GET )
    public String foo() {
        return "GET!!";
    }
    
}
