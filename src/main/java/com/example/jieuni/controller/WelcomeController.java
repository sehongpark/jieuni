package com.example.jieuni.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class WelcomeController {

    @GetMapping("/jieun")
    public String jieun() {
        return "hello-jieun";
    }

    @GetMapping("/{name}")
    public String hello(@PathVariable String name,
                        Model model) {
        model.addAttribute("inputUserName", name);
        return "hello";
    }

}
