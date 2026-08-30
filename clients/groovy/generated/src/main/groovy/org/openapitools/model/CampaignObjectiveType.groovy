package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum CampaignObjectiveType {

    AWARENESS("AWARENESS"),
    
    CONSIDERATION("CONSIDERATION"),
    
    VIDEO_VIEW("VIDEO_VIEW"),
    
    WEB_CONVERSION("WEB_CONVERSION"),
    
    CATALOG_SALES("CATALOG_SALES"),
    
    WEB_SESSIONS("WEB_SESSIONS"),
    
    VIDEO_COMPLETION("VIDEO_COMPLETION"),
    
    APP_INSTALL("APP_INSTALL"),
    
    SALES("SALES"),
    
    LEADS("LEADS"),
    
    CTV_CONSIDERATION("CTV_CONSIDERATION")

    private final String value

    CampaignObjectiveType(String value) {
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
