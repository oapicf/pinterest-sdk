package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum BusinessRole {

    EMPLOYEE("EMPLOYEE"),
    
    BIZ_ADMIN("BIZ_ADMIN"),
    
    PARTNER("PARTNER")

    private final String value

    BusinessRole(String value) {
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
