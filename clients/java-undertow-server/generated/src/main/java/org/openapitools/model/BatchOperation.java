/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.12.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * The operation performed by the batch. The DELETE_DISCONTINUED operation only updates availablity to \"Out of Stock\".
 */

/**
 * The operation performed by the batch. The DELETE_DISCONTINUED operation only updates availablity to \"Out of Stock\".
 */
public enum BatchOperation {
    
        UPDATE("UPDATE"),
        
        UPSERT("UPSERT"),
        
        CREATE("CREATE"),
        
        DELETE_DISCONTINUED("DELETE_DISCONTINUED"),
        
        DELETE("DELETE");

private String value;

BatchOperation(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static BatchOperation fromValue(String text) {
for (BatchOperation b : BatchOperation.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


