/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.3.0
 * Maintained by: pinterest-api@pinterest.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Gets or Sets MediaUploadType
 */
public enum MediaUploadType {
    
        VIDEO("video");

private String value;

MediaUploadType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static MediaUploadType fromValue(String text) {
for (MediaUploadType b : MediaUploadType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


