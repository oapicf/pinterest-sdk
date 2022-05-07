/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.3.0
 * Maintained by: pinterest-api@pinterest.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * The status of the item processing record
 */

/**
 * The status of the item processing record
 */
public enum ItemProcessingStatus {
    
        SUCCESS("SUCCESS"),
        
        FAILURE("FAILURE"),
        
        PROCESSING("PROCESSING");

private String value;

ItemProcessingStatus(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static ItemProcessingStatus fromValue(String text) {
for (ItemProcessingStatus b : ItemProcessingStatus.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


