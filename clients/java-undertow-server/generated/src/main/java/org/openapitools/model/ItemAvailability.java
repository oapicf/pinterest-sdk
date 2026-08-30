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
 * Availability of the item
 */

/**
 * Availability of the item
 */
public enum ItemAvailability {
    
        IN_STOCK("in stock"),
        
        OUT_OF_STOCK("out of stock"),
        
        PREORDER("preorder");

private String value;

ItemAvailability(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static ItemAvailability fromValue(String text) {
for (ItemAvailability b : ItemAvailability.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


