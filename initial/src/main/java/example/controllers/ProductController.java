package example.controllers;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ProductController {

    @RequestMapping(value = "/product", method = RequestMethod.GET)
    public String index() {
        return "Greetings from Spring Boot, Product Controller!";
    }

}
