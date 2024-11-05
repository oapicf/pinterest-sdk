package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum BusinessRoleForMembers {

    EMPLOYEE("EMPLOYEE"),
    
    BIZ_ADMIN("BIZ_ADMIN")

    private final String value

    BusinessRoleForMembers(String value) {
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
