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
 * Where a user is taken after clicking on an ad in grid.
 */

/**
 * Where a user is taken after clicking on an ad in grid.
 */
public enum GridClickType {
    
        CLOSEUP("CLOSEUP"),
        
        DIRECT_TO_DESTINATION("DIRECT_TO_DESTINATION");

private String value;

GridClickType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static GridClickType fromValue(String text) {
for (GridClickType b : GridClickType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
return null;
}
}


