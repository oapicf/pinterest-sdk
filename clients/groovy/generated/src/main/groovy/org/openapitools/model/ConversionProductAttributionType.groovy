package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum ConversionProductAttributionType {

    DEFAULT("DEFAULT"),
    
    BRAND_ATTRIBUTION("BRAND_ATTRIBUTION")

    private final String value

    ConversionProductAttributionType(String value) {
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
