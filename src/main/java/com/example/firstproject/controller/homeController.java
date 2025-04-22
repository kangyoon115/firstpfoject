package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {
    @GetMapping("/hi")
    public String home(Model model){
        model.addAttribute("username","망고");
        return "greetings"; //greetings.mustache 파일 반환
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model){
        model.addAttribute("username","망고");
        return "goodbye";
    }

}
