package ru.bookstore.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping(value = {"/", "/index"})
    public String index() {
        return "/index";
    }

    @GetMapping("/user")
    public String user() {
        return "/user";
    }

    @GetMapping("/login")
    public String login() {
        return "/login";
    }

    @GetMapping("/403")
    public String error403() {
        return "/error/403";
    }

    @GetMapping("/catalog")
    public String catalog() { return "/catalog"; }

    @GetMapping("/adminpanel")
    public String adminpanel() { return "/adminpanel"; }

    @GetMapping("/newbook")
    public String newbook() { return "/newbook"; }

    @GetMapping("/characteristic")
    public String characteristic() { return "/characteristic";}
}
