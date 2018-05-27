package ru.bookstore.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.bookstore.domain.Genre;
import ru.bookstore.repos.GenreRepo;

import java.util.Map;

@Controller
public class MainController {
    @Autowired
    private GenreRepo genreRepo;

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
    public String characteristic(Map<String, Object> model) {
        Iterable<Genre> genres = genreRepo.findAll();
        model.put("genres", genres);

        return "/characteristic";
    }

    @PostMapping
    public String addGenre(@RequestParam String name, Map<String, Object> model){
        Genre genre = new Genre(name);
        genreRepo.save(genre);
        Iterable<Genre> genres = genreRepo.findAll();
        model.put("genres", genres);
        return  "/characteristic";
    }
}
