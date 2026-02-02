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
    public String home(){
        return "home";
    }

    @GetMapping("/profile")
    public String profile( Model model, @RequestParam(name = "name") String name){
        model.addAttribute("name", name);
        model.addAttribute("post", (int)(Math.random() * 100));
        return "profile";
    }
}
