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
 * Possible status for a bulk reporting job
 */

/**
 * Possible status for a bulk reporting job
 */
public enum BulkReportingJobStatus {
    
        DOES_NOT_EXIST("DOES_NOT_EXIST"),
        
        FINISHED("FINISHED"),
        
        IN_PROGRESS("IN_PROGRESS"),
        
        EXPIRED("EXPIRED"),
        
        FAILED("FAILED"),
        
        CANCELLED("CANCELLED");

private String value;

BulkReportingJobStatus(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static BulkReportingJobStatus fromValue(String text) {
for (BulkReportingJobStatus b : BulkReportingJobStatus.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


