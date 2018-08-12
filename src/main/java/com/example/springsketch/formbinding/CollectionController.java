package com.example.springsketch.formbinding;

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
@RequestMapping("/formbinding/collection")
public class CollectionController {
    @GetMapping("input")
    public String input(Model model) {
        model.addAttribute("formCollection", new FormCollectionFactory().getFormCollection());
        model.addAttribute("simpleForm", new SimpleForm());
        return "formbinding/collection/input";
    }

    @PostMapping("output")
    public String output(@ModelAttribute SimpleForm simpleForm) {
        return "formbinding/collection/output";
    }
}
