/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.14.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Reporting targeting type for ads
 */

/**
 * Reporting targeting type for ads
 */
public enum AdsAnalyticsAdTargetingType {
    
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
        
        AGE_BUCKET_AND_GENDER("AGE_BUCKET_AND_GENDER");

private String value;

AdsAnalyticsAdTargetingType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static AdsAnalyticsAdTargetingType fromValue(String text) {
for (AdsAnalyticsAdTargetingType b : AdsAnalyticsAdTargetingType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


