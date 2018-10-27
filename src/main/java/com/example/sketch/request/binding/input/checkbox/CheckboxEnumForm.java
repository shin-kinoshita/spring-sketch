package com.example.sketch.request.binding.input.checkbox;

import java.util.List;

/**
 * @author subaru
 */
public class CheckboxEnumForm {

    enum Fruit {
        apple,
        banana,
        mango;
    }

    private List<Fruit> favoriteFruits;

    public void setFavoriteFruits(List<Fruit> favoriteFruits) {
        this.favoriteFruits = favoriteFruits;
    }

    public List<Fruit> getFavoriteFruits() {
        return favoriteFruits;
    }
}
