package com.example.sketch.formbinding;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author subaru
 */
@Controller
@RequestMapping("/formbinding/simple")
public class SimpleController {
    @GetMapping("input")
    public String input(Model model) {
        model.addAttribute("simpleForm", new SimpleForm());
        return "formbinding/simple/input";
    }

    @PostMapping("output")
    public String output(@ModelAttribute SimpleForm simpleForm) {
        return "formbinding/simple/output";
    }
}
