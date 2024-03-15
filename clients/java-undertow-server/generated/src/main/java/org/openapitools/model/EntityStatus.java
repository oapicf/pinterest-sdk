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
 * Entity status
 */

/**
 * Entity status
 */
public enum EntityStatus {
    
        ACTIVE("ACTIVE"),
        
        PAUSED("PAUSED"),
        
        ARCHIVED("ARCHIVED"),
        
        DRAFT("DRAFT"),
        
        DELETED_DRAFT("DELETED_DRAFT");

private String value;

EntityStatus(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static EntityStatus fromValue(String text) {
for (EntityStatus b : EntityStatus.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


