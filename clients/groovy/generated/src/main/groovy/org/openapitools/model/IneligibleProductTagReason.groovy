package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum IneligibleProductTagReason {

    PIN_MISSING("PIN_MISSING"),
    
    PIN_IS_PRIVATE("PIN_IS_PRIVATE"),
    
    PRODUCT_METADATA_MISSING("PRODUCT_METADATA_MISSING"),
    
    PIN_NOT_FROM_VERIFIED_DOMAIN("PIN_NOT_FROM_VERIFIED_DOMAIN"),
    
    PIN_NOT_FROM_SAME_USER_AS_HERO_PIN("PIN_NOT_FROM_SAME_USER_AS_HERO_PIN")

    private final String value

    IneligibleProductTagReason(String value) {
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
