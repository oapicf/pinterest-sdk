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
 * Keyword match type allowing null
 */

/**
 * Keyword match type allowing null
 */
public enum NullalbleMatchType {
    
        BROAD("BROAD"),
        
        PHRASE("PHRASE"),
        
        EXACT("EXACT"),
        
        EXACT_NEGATIVE("EXACT_NEGATIVE"),
        
        PHRASE_NEGATIVE("PHRASE_NEGATIVE");

private String value;

NullalbleMatchType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static NullalbleMatchType fromValue(String text) {
for (NullalbleMatchType b : NullalbleMatchType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
return null;
}
}


