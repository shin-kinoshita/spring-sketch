package com.example.sketch.request.binding.input.password.simple;

import javax.validation.constraints.Size;

/**
 * @author subaru
 */
public class PasswordSimpleForm {
    private String name;

    @Size(min = 8, max = 16)
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
