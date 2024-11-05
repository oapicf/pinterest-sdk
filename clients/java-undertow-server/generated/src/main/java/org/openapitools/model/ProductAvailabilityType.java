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
 * Default availability for products in a feed.
 */

/**
 * Default availability for products in a feed.
 */
public enum ProductAvailabilityType {
    
        IN_STOCK("IN_STOCK"),
        
        OUT_OF_STOCK("OUT_OF_STOCK"),
        
        PREORDER("PREORDER");

private String value;

ProductAvailabilityType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static ProductAvailabilityType fromValue(String text) {
for (ProductAvailabilityType b : ProductAvailabilityType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
return null;
}
}


