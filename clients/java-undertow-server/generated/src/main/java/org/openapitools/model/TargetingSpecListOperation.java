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
 * Gets or Sets TargetingSpecListOperation
 */
public enum TargetingSpecListOperation {
    
        SET("SET"),
        
        ADD("ADD"),
        
        REMOVE("REMOVE");

private String value;

TargetingSpecListOperation(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static TargetingSpecListOperation fromValue(String text) {
for (TargetingSpecListOperation b : TargetingSpecListOperation.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


