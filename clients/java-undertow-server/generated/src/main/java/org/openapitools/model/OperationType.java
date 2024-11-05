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
 * Operation type to share a specific audience or revoke access to a previously shared audience
 */

/**
 * Operation type to share a specific audience or revoke access to a previously shared audience
 */
public enum OperationType {
    
        SHARE("SHARE"),
        
        REVOKE("REVOKE");

private String value;

OperationType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static OperationType fromValue(String text) {
for (OperationType b : OperationType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


