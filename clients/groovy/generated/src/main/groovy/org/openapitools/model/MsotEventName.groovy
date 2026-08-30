package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum MsotEventName {

    ADD_TO_CART("add_to_cart"),
    
    CHECKOUT("checkout"),
    
    LEAD("lead"),
    
    SIGNUP("signup")

    private final String value

    MsotEventName(String value) {
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
