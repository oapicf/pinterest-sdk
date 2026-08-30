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
 * Ad event type used for attribution.
 */

/**
 * Ad event type used for attribution.
 */
public enum AttributionScope {
    
        VIEW("view"),
        
        ENGAGEMENT("engagement"),
        
        CLICK("click");

private String value;

AttributionScope(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static AttributionScope fromValue(String text) {
for (AttributionScope b : AttributionScope.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


