package com.example.sketch.binding.simple.input;

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
@RequestMapping("/binding/simple")
public class SimpleController {
    @GetMapping("input")
    public String input(Model model) {
        model.addAttribute("simpleForm", new SimpleForm());
        return "binding/simple/input/input";
    }

    @PostMapping("output")
    public String output(@ModelAttribute SimpleForm simpleForm) {
        return "binding/simple/input/output";
    }
}
