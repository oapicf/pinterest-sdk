/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.23.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Gets or Sets EnhancedMatchStatusType
 */
public enum EnhancedMatchStatusType {
    
        UNKNOWN("UNKNOWN"),
        
        NOT_VALIDATED("NOT_VALIDATED"),
        
        VALIDATING_IN_PROGRESS("VALIDATING_IN_PROGRESS"),
        
        VALIDATION_COMPLETE("VALIDATION_COMPLETE");

private String value;

EnhancedMatchStatusType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static EnhancedMatchStatusType fromValue(String text) {
for (EnhancedMatchStatusType b : EnhancedMatchStatusType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


