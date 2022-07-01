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
 * Campaign objective type.
 */

/**
 * Campaign objective type.
 */
public enum ObjectiveType {
    
        AWARENESS("AWARENESS"),
        
        CONSIDERATION("CONSIDERATION"),
        
        VIDEO_VIEW("VIDEO_VIEW"),
        
        WEB_CONVERSION("WEB_CONVERSION"),
        
        CATALOG_SALES("CATALOG_SALES"),
        
        WEB_SESSIONS("WEB_SESSIONS"),
        
        AWARENESS_RESERVED("AWARENESS_RESERVED"),
        
        ENGAGEMENT("ENGAGEMENT");

private String value;

ObjectiveType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static ObjectiveType fromValue(String text) {
for (ObjectiveType b : ObjectiveType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


