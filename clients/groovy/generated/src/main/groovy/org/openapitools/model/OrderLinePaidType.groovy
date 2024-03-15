package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum OrderLinePaidType {

    PAID("PAID"),
    
    BONUS("BONUS"),
    
    MAKE_GOOD("MAKE_GOOD"),
    
    TEST("TEST"),
    
    NULL("null")

    private final String value

    OrderLinePaidType(String value) {
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
