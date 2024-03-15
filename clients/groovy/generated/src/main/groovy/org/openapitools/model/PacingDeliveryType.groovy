package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum PacingDeliveryType {

    STANDARD("STANDARD"),
    
    ACCELERATED("ACCELERATED")

    private final String value

    PacingDeliveryType(String value) {
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
