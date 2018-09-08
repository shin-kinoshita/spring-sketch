package com.example.sketch.request.binding.simple.text;

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
@RequestMapping("/binding/simple/text")
public class SimpleTextController {
    @GetMapping("input")
    public String input(Model model) {
        model.addAttribute("simpleTextForm", new SimpleTextForm());
        return "binding/simple/text/input";
    }

    @PostMapping("output")
    public String output(@ModelAttribute SimpleTextForm simpleTextForm) {
        return "binding/simple/text/output";
    }
}
