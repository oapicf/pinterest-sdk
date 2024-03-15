package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum DataOutputFormat {

    JSON("JSON"),
    
    CSV("CSV")

    private final String value

    DataOutputFormat(String value) {
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
