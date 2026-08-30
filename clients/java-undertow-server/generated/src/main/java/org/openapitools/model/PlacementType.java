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
 * Placement type for bid multiplier targeting.
 */

/**
 * Placement type for bid multiplier targeting.
 */
public enum PlacementType {
    
        SEARCH("SEARCH"),
        
        BROWSE("BROWSE"),
        
        RELATED_PINS("RELATED_PINS");

private String value;

PlacementType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static PlacementType fromValue(String text) {
for (PlacementType b : PlacementType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


