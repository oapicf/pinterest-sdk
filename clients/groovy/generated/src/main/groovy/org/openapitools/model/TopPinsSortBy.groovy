package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum TopPinsSortBy {

    ENGAGEMENT("ENGAGEMENT"),
    
    SAVE("SAVE"),
    
    IMPRESSION("IMPRESSION"),
    
    OUTBOUND_CLICK("OUTBOUND_CLICK"),
    
    PIN_CLICK("PIN_CLICK")

    private final String value

    TopPinsSortBy(String value) {
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
