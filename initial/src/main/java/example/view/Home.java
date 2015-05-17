package hello.view;

import org.springframework.web.bind.annotation.RequestMapping;


import javax.servlet.http.HttpSession;

/**
 * Created by bakeneko on 5/17/15.
 */


public class Home {

    @RequestMapping(value = "/home2")
    public String login(HttpSession session) {
        // do stuff

        // Thymeleaf (delegated by springmvc) will request the "login" view at which
        // point the prefix and suffix are added to resolve the template location.
        return "home.html";
    }
}
