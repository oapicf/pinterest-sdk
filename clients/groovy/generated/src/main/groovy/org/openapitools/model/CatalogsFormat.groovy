package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum CatalogsFormat {

    TSV("TSV"),
    
    CSV("CSV"),
    
    XML("XML")

    private final String value

    CatalogsFormat(String value) {
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
