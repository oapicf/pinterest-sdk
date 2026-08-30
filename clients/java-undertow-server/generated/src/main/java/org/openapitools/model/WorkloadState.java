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
 * Workload processing state
 */

/**
 * Workload processing state
 */
public enum WorkloadState {
    
        NOT_STARTED("NOT_STARTED"),
        
        RUNNING("RUNNING"),
        
        PAUSED("PAUSED"),
        
        SUCCEEDED("SUCCEEDED"),
        
        FAILED("FAILED");

private String value;

WorkloadState(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static WorkloadState fromValue(String text) {
for (WorkloadState b : WorkloadState.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


