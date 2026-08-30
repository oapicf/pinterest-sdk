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
 * Overall status of event quality score.
 */

/**
 * Overall status of event quality score.
 */
public enum OverallStatusOptions {
    
        NEEDS_IMPROVEMENT("NEEDS_IMPROVEMENT"),
        
        FAIR("FAIR"),
        
        GOOD("GOOD");

private String value;

OverallStatusOptions(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static OverallStatusOptions fromValue(String text) {
for (OverallStatusOptions b : OverallStatusOptions.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


