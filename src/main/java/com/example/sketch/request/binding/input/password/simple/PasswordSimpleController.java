package com.example.sketch.request.binding.input.password.simple;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author subaru
 */
@Controller
@RequestMapping("/binding/input/password/simple")
public class PasswordSimpleController {
    @GetMapping
    public String input(Model model) {
        model.addAttribute("passwordSimpleForm", new PasswordSimpleForm());
        return "binding/input/password/simple/input";
    }

    @PostMapping
    public String output(@Validated @ModelAttribute PasswordSimpleForm passwordSimpleForm, BindingResult br) {
        if (br.hasErrors()) {
            return "binding/input/password/simple/input";
        }
        return "binding/input/password/simple/output";
    }
}
