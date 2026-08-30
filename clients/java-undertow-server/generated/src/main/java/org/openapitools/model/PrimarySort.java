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
 * Whether to first sort the report by date or by ID
 */

/**
 * Whether to first sort the report by date or by ID
 */
public enum PrimarySort {
    
        BY_ID("BY_ID"),
        
        BY_DATE("BY_DATE");

private String value;

PrimarySort(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static PrimarySort fromValue(String text) {
for (PrimarySort b : PrimarySort.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


