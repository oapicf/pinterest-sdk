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
 * Discount status based on the current time and start and end time of discount
 */

/**
 * Discount status based on the current time and start and end time of discount
 */
public enum DiscountStatus {
    
        OTHER("OTHER"),
        
        ACTIVE("ACTIVE"),
        
        PAUSED("PAUSED"),
        
        SCHEDULED("SCHEDULED"),
        
        EXPIRED("EXPIRED");

private String value;

DiscountStatus(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static DiscountStatus fromValue(String text) {
for (DiscountStatus b : DiscountStatus.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


