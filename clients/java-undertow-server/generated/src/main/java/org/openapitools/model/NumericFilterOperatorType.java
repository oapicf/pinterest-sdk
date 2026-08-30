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
import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Gets or Sets NumericFilterOperatorType
 */
public enum NumericFilterOperatorType {
    
        GREATER_THAN("GREATER_THAN"),
        
        GREATER_THAN_OR_EQUALS("GREATER_THAN_OR_EQUALS"),
        
        LESS_THAN("LESS_THAN"),
        
        LESS_THAN_OR_EQUALS("LESS_THAN_OR_EQUALS");

private String value;

NumericFilterOperatorType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static NumericFilterOperatorType fromValue(String text) {
for (NumericFilterOperatorType b : NumericFilterOperatorType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


