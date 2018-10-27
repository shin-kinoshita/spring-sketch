package com.example.sketch.request.binding.input.checkbox;

import java.util.List;

/**
 * @author subaru
 */
public class CheckboxCategoryForm {
    private List<String> favoriteFruits;
//    private List<String> favoriteFruits = Collections.singletonList("apple");

    public void setFavoriteFruits(List<String> favoriteFruits) {
        this.favoriteFruits = favoriteFruits;
    }

    public List<String> getFavoriteFruits() {
        return favoriteFruits;
    }
}
