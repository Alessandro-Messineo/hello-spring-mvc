package org.lessons.java.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class GeneralController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/profile")
    public String profile(Model model, @RequestParam(name = "name") String name) {
        model.addAttribute("name", name);
        model.addAttribute("post", (int) (Math.random() * 100));
        return "profile";
    }

    @GetMapping("/stats")
    public String stats(Model model) {
        int visite = (int) (Math.random() * 100);
        String messaggio;

        if (visite > 50) {
            messaggio = "Il sito è popolare";
        } else {
            messaggio = "Il sito non è popolare";
        }

        model.addAttribute("visite", visite);
        model.addAttribute("messaggio", messaggio);

        return "stats";
    }
}
