package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum IntendedPromotionType {

    LEGACY("LEGACY"),
    
    STANDARD_AD("STANDARD_AD"),
    
    CATALOG("CATALOG")

    private final String value

    IntendedPromotionType(String value) {
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
