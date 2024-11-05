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
 * Granularity
 */

/**
 * Granularity
 */
public enum Granularity {
    
        TOTAL("TOTAL"),
        
        DAY("DAY"),
        
        HOUR("HOUR"),
        
        WEEK("WEEK"),
        
        MONTH("MONTH");

private String value;

Granularity(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static Granularity fromValue(String text) {
for (Granularity b : Granularity.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


