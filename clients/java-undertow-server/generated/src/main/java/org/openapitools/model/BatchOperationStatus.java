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
 * The status of the operation performed by the batch
 */

/**
 * The status of the operation performed by the batch
 */
public enum BatchOperationStatus {
    
        PROCESSING("PROCESSING"),
        
        COMPLETED("COMPLETED"),
        
        FAILED("FAILED");

private String value;

BatchOperationStatus(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static BatchOperationStatus fromValue(String text) {
for (BatchOperationStatus b : BatchOperationStatus.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


