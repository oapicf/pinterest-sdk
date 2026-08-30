/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Standard Pin metric types
 */

/**
 * Standard Pin metric types
 */
public enum StandardPinMetricTypes {
    
        IMPRESSION("IMPRESSION"),
        
        OUTBOUND_CLICK("OUTBOUND_CLICK"),
        
        PIN_CLICK("PIN_CLICK"),
        
        SAVE("SAVE"),
        
        SAVE_RATE("SAVE_RATE"),
        
        TOTAL_COMMENTS("TOTAL_COMMENTS"),
        
        TOTAL_REACTIONS("TOTAL_REACTIONS"),
        
        USER_FOLLOW("USER_FOLLOW"),
        
        PROFILE_VISIT("PROFILE_VISIT");

private String value;

StandardPinMetricTypes(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static StandardPinMetricTypes fromValue(String text) {
for (StandardPinMetricTypes b : StandardPinMetricTypes.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


