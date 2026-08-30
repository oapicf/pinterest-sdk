package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum PromotionApplicationLevel {

    NONE("NONE"),
    
    ITEM("ITEM"),
    
    AD_GROUP("AD_GROUP")

    private final String value

    PromotionApplicationLevel(String value) {
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
