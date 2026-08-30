package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum Permissions {

    ADMIN("ADMIN"),
    
    ANALYST("ANALYST"),
    
    FINANCE_MANAGER("FINANCE_MANAGER"),
    
    FINANCE_EDIT("FINANCE_EDIT"),
    
    FINANCE_VIEW("FINANCE_VIEW"),
    
    AUDIENCE_MANAGER("AUDIENCE_MANAGER"),
    
    CAMPAIGN_MANAGER("CAMPAIGN_MANAGER"),
    
    CATALOGS_MANAGER("CATALOGS_MANAGER"),
    
    CATALOGS_VIEWER("CATALOGS_VIEWER"),
    
    PROFILE_PUBLISHER("PROFILE_PUBLISHER"),
    
    CONSUMER_USER("CONSUMER_USER"),
    
    BIZ_PINNER_LIST_SHARER("BIZ_PINNER_LIST_SHARER")

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
