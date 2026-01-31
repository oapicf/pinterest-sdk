package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum VerticalProductCategory {

    FASHION("FASHION"),
    
    HOME_DECOR("HOME_DECOR"),
    
    BEAUTY("BEAUTY")

    private final String value

    VerticalProductCategory(String value) {
        this.value = value
    }

    String getValue() {
        value
    }

    @Override
    String toString() {
        String.valueOf(value)
    }
}
