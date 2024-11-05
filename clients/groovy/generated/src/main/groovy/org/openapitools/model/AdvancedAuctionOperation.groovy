package org.openapitools.model;

import groovy.transform.Canonical

enum AdvancedAuctionOperation {

    UPSERT("UPSERT"),
    
    DELETE("DELETE")

    private final String value

    AdvancedAuctionOperation(String value) {
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
