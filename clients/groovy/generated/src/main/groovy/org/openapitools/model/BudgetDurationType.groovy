package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum BudgetDurationType {

    FIXED_DAILY("FIXED_DAILY"),
    
    FLEXIBLE_DAILY("FLEXIBLE_DAILY"),
    
    LIFETIME("LIFETIME")

    private final String value

    BudgetDurationType(String value) {
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
