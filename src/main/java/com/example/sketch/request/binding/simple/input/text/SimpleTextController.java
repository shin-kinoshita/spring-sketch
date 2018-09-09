package com.example.sketch.request.binding.simple.input.text;

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
@RequestMapping("/binding/simple/input/text")
public class SimpleTextController {
    @GetMapping
    public String input(Model model) {
        model.addAttribute("simpleTextForm", new SimpleTextForm());
        return "binding/simple/input/text/input";
    }

    @PostMapping
    public String output(@ModelAttribute SimpleTextForm simpleTextForm) {
        return "binding/simple/input/text/output";
    }
}
