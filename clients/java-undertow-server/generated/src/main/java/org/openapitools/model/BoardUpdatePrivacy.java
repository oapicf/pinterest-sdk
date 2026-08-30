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
 * Gets or Sets BoardUpdatePrivacy
 */
public enum BoardUpdatePrivacy {
    
        PUBLIC("PUBLIC"),
        
        SECRET("SECRET");

private String value;

BoardUpdatePrivacy(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static BoardUpdatePrivacy fromValue(String text) {
for (BoardUpdatePrivacy b : BoardUpdatePrivacy.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


