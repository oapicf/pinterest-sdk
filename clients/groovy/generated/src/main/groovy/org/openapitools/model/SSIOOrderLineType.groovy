package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum SSIOOrderLineType {

    BUDGET("BUDGET"),
    
    PERPETUALS("PERPETUALS")

    private final String value

    SSIOOrderLineType(String value) {
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
