package org.openapitools.model;

import groovy.transform.Canonical

enum TargetingSpecTargetingStrategyItems {

    CHOOSE_YOUR_OWN("CHOOSE_YOUR_OWN"),
    
    FIND_NEW_CUSTOMERS("FIND_NEW_CUSTOMERS"),
    
    RECONNECT_WITH_USERS("RECONNECT_WITH_USERS")

    private final String value

    TargetingSpecTargetingStrategyItems(String value) {
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
