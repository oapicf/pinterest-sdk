package org.openapitools.model;

import groovy.transform.Canonical

enum ProductCategoriesEngagementType {

    ENGAGEMENT("ENGAGEMENT"),
    
    OUTBOUND_CLICK("OUTBOUND_CLICK"),
    
    SAVE("SAVE")

    private final String value

    ProductCategoriesEngagementType(String value) {
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
