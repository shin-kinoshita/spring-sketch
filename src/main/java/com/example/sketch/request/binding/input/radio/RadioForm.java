package com.example.sketch.request.binding.input.radio;

/**
 * @author subaru
 */
public class RadioForm {
    private String name;
    private String gender = "male";

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}
