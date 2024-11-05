package org.openapitools.model;

import groovy.transform.Canonical

enum AudienceAccountType {

    AD_ACCOUNT("AD_ACCOUNT"),
    
    BUSINESS_ACCOUNT("BUSINESS_ACCOUNT")

    private final String value

    AudienceAccountType(String value) {
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
