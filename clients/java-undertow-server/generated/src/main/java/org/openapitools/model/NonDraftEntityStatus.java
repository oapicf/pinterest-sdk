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
 * Entity status
 */

/**
 * Entity status
 */
public enum NonDraftEntityStatus {
    
        ACTIVE("ACTIVE"),
        
        PAUSED("PAUSED"),
        
        ARCHIVED("ARCHIVED");

private String value;

NonDraftEntityStatus(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static NonDraftEntityStatus fromValue(String text) {
for (NonDraftEntityStatus b : NonDraftEntityStatus.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


