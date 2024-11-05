package org.openapitools.model;

import groovy.transform.Canonical

enum Permissions {

    ADMIN("ADMIN"),
    
    ANALYST("ANALYST"),
    
    FINANCE_MANAGER("FINANCE_MANAGER"),
    
    AUDIENCE_MANAGER("AUDIENCE_MANAGER"),
    
    CAMPAIGN_MANAGER("CAMPAIGN_MANAGER"),
    
    CATALOGS_MANAGER("CATALOGS_MANAGER"),
    
    PROFILE_PUBLISHER("PROFILE_PUBLISHER")

    private final String value

    Permissions(String value) {
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
