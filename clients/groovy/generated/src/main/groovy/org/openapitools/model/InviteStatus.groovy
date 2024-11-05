package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum InviteStatus {

    PENDING("PENDING"),
    
    ACCEPTED("ACCEPTED"),
    
    DECLINED("DECLINED"),
    
    CANCELLED("CANCELLED"),
    
    EXPIRED("EXPIRED")

    private final String value

    InviteStatus(String value) {
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
