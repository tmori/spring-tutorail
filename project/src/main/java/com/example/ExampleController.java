package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExampleController {

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Hello World");
        return "hello";
    }


}