package com.example.floralshop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/specials")
    public String specials() {
        return "specials";
    }

    @GetMapping("/bouquets")
    public String bouquets() {
        return "bouquets";
    }

    @GetMapping("/contacts")
    public String contacts() {
        return "contacts";
    }
    
    @GetMapping("/news")
    public String news() {
        return "news";
    }
}
