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
 * Gets or Sets AdPinPreviewCreativeType
 */
public enum AdPinPreviewCreativeType {
    
        SHOPPING("SHOPPING"),
        
        COLLECTION("COLLECTION"),
        
        MAX_VIDEO("MAX_VIDEO"),
        
        MAX_WIDTH_VIDEO_COLLECTION("MAX_WIDTH_VIDEO_COLLECTION"),
        
        MAX_WIDTH_REGULAR_COLLECTION("MAX_WIDTH_REGULAR_COLLECTION");

private String value;

AdPinPreviewCreativeType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static AdPinPreviewCreativeType fromValue(String text) {
for (AdPinPreviewCreativeType b : AdPinPreviewCreativeType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


