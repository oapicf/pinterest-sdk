/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.12.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Product availability.
 */

/**
 * Product availability.
 */
public enum NonNullableProductAvailabilityType {
    
        IN_STOCK("IN_STOCK"),
        
        OUT_OF_STOCK("OUT_OF_STOCK"),
        
        PREORDER("PREORDER");

private String value;

NonNullableProductAvailabilityType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static NonNullableProductAvailabilityType fromValue(String text) {
for (NonNullableProductAvailabilityType b : NonNullableProductAvailabilityType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


