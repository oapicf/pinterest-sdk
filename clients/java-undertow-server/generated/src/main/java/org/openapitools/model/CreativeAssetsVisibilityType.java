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
 * Creative assets visibility.
 */

/**
 * Creative assets visibility.
 */
public enum CreativeAssetsVisibilityType {
    
        VISIBLE("VISIBLE"),
        
        HIDDEN("HIDDEN");

private String value;

CreativeAssetsVisibilityType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static CreativeAssetsVisibilityType fromValue(String text) {
for (CreativeAssetsVisibilityType b : CreativeAssetsVisibilityType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


