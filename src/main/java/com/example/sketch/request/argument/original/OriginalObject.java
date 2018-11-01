package com.example.sketch.request.argument.original;

/**
 * @author subaru
 */
public class OriginalObject {
    private String name;
    private String favoriteCurry;

    public OriginalObject(String name, String favoriteCurry) {
        this.name = name;
        this.favoriteCurry = favoriteCurry;
    }

    public String getName() {
        return name;
    }

    public String getFavoriteCurry() {
        return favoriteCurry;
    }
}
