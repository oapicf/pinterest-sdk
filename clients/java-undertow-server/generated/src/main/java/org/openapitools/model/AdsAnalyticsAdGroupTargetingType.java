/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.23.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Reporting targeting type for ad groups
 */

/**
 * Reporting targeting type for ad groups
 */
public enum AdsAnalyticsAdGroupTargetingType {
    
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
        
        CREATIVE_ENHANCEMENTS("CREATIVE_ENHANCEMENTS");

private String value;

AdsAnalyticsAdGroupTargetingType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static AdsAnalyticsAdGroupTargetingType fromValue(String text) {
for (AdsAnalyticsAdGroupTargetingType b : AdsAnalyticsAdGroupTargetingType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


