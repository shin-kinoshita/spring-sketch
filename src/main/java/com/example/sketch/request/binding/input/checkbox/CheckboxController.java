package com.example.sketch.request.binding.input.checkbox;

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
@RequestMapping("/binding/input/checkbox")
public class CheckboxController {
    @GetMapping("element")
    public String inputElement(Model model) {
        model.addAttribute("checkboxElementForm", new CheckboxElementForm());
        return "binding/input/checkbox/input_element";
    }

    @PostMapping("element")
    public String outputElement(@ModelAttribute CheckboxElementForm checkboxElementForm) {
        return "binding/input/checkbox/output_element";
    }

    @GetMapping("category")
    public String inputCategory(Model model) {
        model.addAttribute("checkboxCategoryForm", new CheckboxCategoryForm());
        return "binding/input/checkbox/input_category";
    }

    @PostMapping("category")
    public String outputCategory(@ModelAttribute CheckboxCategoryForm checkboxCategoryForm) {
        return "binding/input/checkbox/output_category";
    }
}
