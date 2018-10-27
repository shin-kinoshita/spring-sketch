package com.example.sketch.request.binding.input.radio;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author subaru
 */
@Controller
@RequestMapping("/binding/input/radio")
public class RadioController {
    @GetMapping
    public String input(Model model) {
        model.addAttribute("radioForm", new RadioForm());
        return "binding/input/radio/input";
    }

    @PostMapping
    public String output(RadioForm radioForm) {
        return "binding/input/radio/output";
    }
}
