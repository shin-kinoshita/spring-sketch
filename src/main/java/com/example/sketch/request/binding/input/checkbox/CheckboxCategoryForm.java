package com.example.sketch.request.binding.input.checkbox;

import java.util.List;

/**
 * @author subaru
 */
public class CheckboxCategoryForm {
    private List<String> fruits;
//    private List<String> fruits = Collections.singletonList("apple");

    public void setFruits(List<String> fruits) {
        this.fruits = fruits;
    }

    public List<String> getFruits() {
        return fruits;
    }
}
