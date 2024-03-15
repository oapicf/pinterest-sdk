package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum Role {

    UNKNOWN("UNKNOWN"),
    
    OWNER("OWNER"),
    
    ADMIN("ADMIN"),
    
    ANALYST("ANALYST"),
    
    SOS_READER("SOS_READER"),
    
    FINANCE_MANAGER("FINANCE_MANAGER"),
    
    AUDIENCE_MANAGER("AUDIENCE_MANAGER"),
    
    CAMPAIGN_MANAGER("CAMPAIGN_MANAGER"),
    
    CATALOGS_MANAGER("CATALOGS_MANAGER"),
    
    RESTRICTED_OWNER("RESTRICTED_OWNER"),
    
    PROFILE_MANAGER("PROFILE_MANAGER"),
    
    PROFILE_PUBLISHER("PROFILE_PUBLISHER"),
    
    RESOURCE_PINNER_LIST_OWNER("RESOURCE_PINNER_LIST_OWNER"),
    
    RESOURCE_PINNER_LIST_READER("RESOURCE_PINNER_LIST_READER"),
    
    BIZ_PINNER_LIST_SHARER("BIZ_PINNER_LIST_SHARER"),
    
    RESOURCE_CONVERSION_TAGS_READER("RESOURCE_CONVERSION_TAGS_READER")

    private final String value

    Role(String value) {
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
