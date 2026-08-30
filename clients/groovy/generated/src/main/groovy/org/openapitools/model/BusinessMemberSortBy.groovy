package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum BusinessMemberSortBy {

    FULL_NAME("FULL_NAME"),
    
    BUSINESS_ROLES("BUSINESS_ROLES"),
    
    CREATED_TIME("CREATED_TIME")

    private final String value

    BusinessMemberSortBy(String value) {
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
