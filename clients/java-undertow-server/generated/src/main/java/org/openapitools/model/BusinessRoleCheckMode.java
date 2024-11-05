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
 * Specifies if the partner is internal or external.
 */

/**
 * Specifies if the partner is internal or external.
 */
public enum BusinessRoleCheckMode {
    
        INTERNAL("INTERNAL"),
        
        EXTERNAL("EXTERNAL");

private String value;

BusinessRoleCheckMode(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static BusinessRoleCheckMode fromValue(String text) {
for (BusinessRoleCheckMode b : BusinessRoleCheckMode.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


