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
 * Bulk request status
 */

/**
 * Bulk request status
 */
public enum BulkRequestStatus {
    
        RUNNING("RUNNING"),
        
        SUCCEEDED("SUCCEEDED"),
        
        FAILED("FAILED");

private String value;

BulkRequestStatus(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static BulkRequestStatus fromValue(String text) {
for (BulkRequestStatus b : BulkRequestStatus.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


