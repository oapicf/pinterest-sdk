package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum BillingProfileStatus {

    UNSPECIFIED("UNSPECIFIED"),
    
    VALID("VALID"),
    
    INVALID("INVALID"),
    
    PENDING("PENDING"),
    
    DELETED("DELETED"),
    
    SECONDARY("SECONDARY"),
    
    PENDING_SECONDARY("PENDING_SECONDARY")

    private final String value

    BillingProfileStatus(String value) {
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
