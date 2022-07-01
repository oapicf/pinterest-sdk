/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.3.0
 * Maintained by: blah@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * The operation performed by the batch
 */

/**
 * The operation performed by the batch
 */
public enum BatchOperation {
    
        UPDATE("UPDATE"),
        
        CREATE("CREATE"),
        
        UPSERT("UPSERT");

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


