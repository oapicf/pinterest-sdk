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
 * Keyword match type
 */

/**
 * Keyword match type
 */
public enum MatchTypeResponse {
    
        BROAD("BROAD"),
        
        PHRASE("PHRASE"),
        
        EXACT("EXACT"),
        
        EXACT_NEGATIVE("EXACT_NEGATIVE"),
        
        PHRASE_NEGATIVE("PHRASE_NEGATIVE");

private String value;

MatchTypeResponse(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static MatchTypeResponse fromValue(String text) {
for (MatchTypeResponse b : MatchTypeResponse.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
return null;
}
}


