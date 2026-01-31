package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum AdsAnalyticsAdGroupTargetingType {

    KEYWORD("KEYWORD"),
    
    APPTYPE("APPTYPE"),
    
    GENDER("GENDER"),
    
    LOCATION("LOCATION"),
    
    PLACEMENT("PLACEMENT"),
    
    COUNTRY("COUNTRY"),
    
    TARGETED_INTEREST("TARGETED_INTEREST"),
    
    PINNER_INTEREST("PINNER_INTEREST"),
    
    AUDIENCE_INCLUDE("AUDIENCE_INCLUDE"),
    
    GEO("GEO"),
    
    AGE_BUCKET("AGE_BUCKET"),
    
    REGION("REGION"),
    
    AGE_BUCKET_AND_GENDER("AGE_BUCKET_AND_GENDER"),
    
    CREATIVE_ENHANCEMENTS("CREATIVE_ENHANCEMENTS")

    private final String value

    AdsAnalyticsAdGroupTargetingType(String value) {
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
