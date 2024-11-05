package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum AdsAnalyticsAdTargetingType {

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
    
    QUIZ_RESULT("QUIZ_RESULT"),
    
    AGE_BUCKET_AND_GENDER("AGE_BUCKET_AND_GENDER")

    private final String value

    AdsAnalyticsAdTargetingType(String value) {
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
