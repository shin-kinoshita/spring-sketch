package com.example.sketch.request.binding.input.text;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author subaru
 */
@Controller
@RequestMapping("/binding/input/text")
public class TextController {
    @GetMapping
    public String input(Model model) {
        model.addAttribute("textForm", new TextForm());
        return "binding/input/text/input";
    }

    @PostMapping
    public String output(TextForm textForm) {
        return "binding/input/text/output";
    }
}
