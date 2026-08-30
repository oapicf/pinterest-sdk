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
import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Gets or Sets BoardPrivacy
 */
public enum BoardPrivacy {
    
        PUBLIC("PUBLIC"),
        
        PROTECTED("PROTECTED"),
        
        SECRET("SECRET");

private String value;

BoardPrivacy(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static BoardPrivacy fromValue(String text) {
for (BoardPrivacy b : BoardPrivacy.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


