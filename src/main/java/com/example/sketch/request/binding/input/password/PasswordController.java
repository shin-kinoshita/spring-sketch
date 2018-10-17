package com.example.sketch.request.binding.input.password;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author subaru
 */
@Controller
@RequestMapping("/binding/input/password")
public class PasswordController {
    @GetMapping
    public String input(Model model) {
        model.addAttribute("passwordForm", new PasswordForm());
        return "binding/input/password/input";
    }

    @PostMapping
    public String output(@Validated PasswordForm passwordForm, BindingResult br) {
        if (br.hasErrors()) {
            return "binding/input/password/input";
        }
        return "binding/input/password/output";
    }
}
