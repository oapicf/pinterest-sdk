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
import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Gets or Sets AudienceInsightType
 */
public enum AudienceInsightType {
    
        YOUR_TOTAL_AUDIENCE("YOUR_TOTAL_AUDIENCE"),
        
        YOUR_ENGAGED_AUDIENCE("YOUR_ENGAGED_AUDIENCE"),
        
        PINTEREST_TOTAL_AUDIENCE("PINTEREST_TOTAL_AUDIENCE");

private String value;

AudienceInsightType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static AudienceInsightType fromValue(String text) {
for (AudienceInsightType b : AudienceInsightType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


