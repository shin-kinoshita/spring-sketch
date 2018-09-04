package com.example.sketch.formbinding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author subaru
 */
public class FormCollectionFactory {
    public List<SimpleForm> getFormCollection() {
        return new ArrayList<>(Arrays.asList(
                new SimpleForm("subaru", "I love india curry"),
                new SimpleForm("amol", "He is the best friend")
        ));
    }
}
