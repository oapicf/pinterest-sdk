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
 * The status of the batch operation
 */

/**
 * The status of the batch operation
 */
public enum SupplementalItemBatchOperationStatus {
    
        PROCESSING("PROCESSING"),
        
        COMPLETED("COMPLETED"),
        
        FAILED("FAILED");

private String value;

SupplementalItemBatchOperationStatus(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static SupplementalItemBatchOperationStatus fromValue(String text) {
for (SupplementalItemBatchOperationStatus b : SupplementalItemBatchOperationStatus.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


