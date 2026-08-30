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
 * Log level type for integration applications.
 */

/**
 * Log level type for integration applications.
 */
public enum IntegrationLogLevel {
    
        INFO("INFO"),
        
        WARN("WARN"),
        
        ERROR("ERROR");

private String value;

IntegrationLogLevel(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static IntegrationLogLevel fromValue(String text) {
for (IntegrationLogLevel b : IntegrationLogLevel.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


