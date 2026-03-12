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

<<<<<<< HEAD
    @GetMapping("/specials")
    public String specials() {
        return "specials";
=======
    @GetMapping("/bouquets")
    public String bouquets() {
        return "bouquets";
>>>>>>> 078390f10a1e9d0286d0d5d3fb49c0153892e2c3
    }
}
