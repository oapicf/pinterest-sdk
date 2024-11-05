package org.openapitools.model;

import groovy.transform.Canonical

enum PermissionsWithOwner {

    ADMIN("ADMIN"),
    
    ANALYST("ANALYST"),
    
    FINANCE_MANAGER("FINANCE_MANAGER"),
    
    AUDIENCE_MANAGER("AUDIENCE_MANAGER"),
    
    CAMPAIGN_MANAGER("CAMPAIGN_MANAGER"),
    
    CATALOGS_MANAGER("CATALOGS_MANAGER"),
    
    CATALOGS_VIEWER("CATALOGS_VIEWER"),
    
    PROFILE_PUBLISHER("PROFILE_PUBLISHER"),
    
    OWNER("OWNER")

    private final String value

    PermissionsWithOwner(String value) {
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
