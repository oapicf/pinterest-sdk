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
 * Match type for an attributed event. P for probabilistic, D for deterministic, NA for Not applicable.
 */

/**
 * Match type for an attributed event. P for probabilistic, D for deterministic, NA for Not applicable.
 */
public enum AttributionMatchType {
    
        P("P"),
        
        D("D"),
        
        NA("NA");

private String value;

AttributionMatchType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static AttributionMatchType fromValue(String text) {
for (AttributionMatchType b : AttributionMatchType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


