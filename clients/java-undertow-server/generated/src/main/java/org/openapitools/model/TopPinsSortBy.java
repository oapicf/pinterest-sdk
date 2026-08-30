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
 * Sort metric for top pins analytics.
 */

/**
 * Sort metric for top pins analytics.
 */
public enum TopPinsSortBy {
    
        ENGAGEMENT("ENGAGEMENT"),
        
        SAVE("SAVE"),
        
        IMPRESSION("IMPRESSION"),
        
        OUTBOUND_CLICK("OUTBOUND_CLICK"),
        
        PIN_CLICK("PIN_CLICK");

private String value;

TopPinsSortBy(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static TopPinsSortBy fromValue(String text) {
for (TopPinsSortBy b : TopPinsSortBy.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


