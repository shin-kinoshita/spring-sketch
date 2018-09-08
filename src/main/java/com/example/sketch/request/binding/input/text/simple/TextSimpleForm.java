package com.example.sketch.request.binding.input.text.simple;

/**
 * @author subaru
 */
public class TextSimpleForm {
    private String name;
    private String text;

    public TextSimpleForm() {

    }

    public TextSimpleForm(String name, String text) {
        this.name = name;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setText(String text) {
        this.text = text;
    }
}
