package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum BudgetType {

    DAILY("DAILY"),
    
    LIFETIME("LIFETIME"),
    
    CBO_ADGROUP("CBO_ADGROUP")

    private final String value

    BudgetType(String value) {
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
