package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum BulkOutputFormat {

    CSV("CSV"),
    
    JSON("JSON")

    private final String value

    BulkOutputFormat(String value) {
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
