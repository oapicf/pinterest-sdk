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
 * Ad targeting types for MMM report
 */

/**
 * Ad targeting types for MMM report
 */
public enum MMMReportingTargetingType {
    
        APPTYPE("APPTYPE"),
        
        COUNTRY("COUNTRY"),
        
        CREATIVE_TYPE("CREATIVE_TYPE"),
        
        GENDER("GENDER"),
        
        LOCATION("LOCATION");

private String value;

MMMReportingTargetingType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static MMMReportingTargetingType fromValue(String text) {
for (MMMReportingTargetingType b : MMMReportingTargetingType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


