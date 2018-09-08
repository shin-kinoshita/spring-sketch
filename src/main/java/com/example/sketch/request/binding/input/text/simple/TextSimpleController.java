package com.example.sketch.request.binding.input.text.simple;

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
@RequestMapping("/binding/input/text/simple")
public class TextSimpleController {
    @GetMapping
    public String input(Model model) {
        model.addAttribute("textSimpleForm", new TextSimpleForm());
        return "binding/input/text/simple/input";
    }

    @PostMapping
    public String output(@ModelAttribute TextSimpleForm textSimpleForm) {
        return "binding/input/text/simple/output";
    }
}
