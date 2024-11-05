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
import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Gets or Sets GetAudiencesOrderBy
 */
public enum GetAudiencesOrderBy {
    
        NONE("NONE"),
        
        ID("ID"),
        
        SIZE("SIZE"),
        
        CREATION_DATE("CREATION_DATE"),
        
        UPDATED_TIME("UPDATED_TIME"),
        
        NAME("NAME"),
        
        STATUS("STATUS"),
        
        TYPE("TYPE");

private String value;

GetAudiencesOrderBy(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static GetAudiencesOrderBy fromValue(String text) {
for (GetAudiencesOrderBy b : GetAudiencesOrderBy.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


