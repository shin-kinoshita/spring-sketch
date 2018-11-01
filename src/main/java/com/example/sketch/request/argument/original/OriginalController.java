package com.example.sketch.request.argument.original;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author subaru
 */
@Controller
@RequestMapping("/argument/original")
public class OriginalController {
    @GetMapping
    public String show(Model model, OriginalObject originalObject) {
        model.addAttribute("originalObject", originalObject);
        return "argument/original/show";
    }
}
