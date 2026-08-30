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
 * Objective for engagement audience filter. Used only on ad account audience rule; matches baseline ObjectiveType (no VIDEO_VIEW, WEB_SESSIONS).
 */

/**
 * Objective for engagement audience filter. Used only on ad account audience rule; matches baseline ObjectiveType (no VIDEO_VIEW, WEB_SESSIONS).
 */
public enum AudienceObjectiveType {
    
        AWARENESS("AWARENESS"),
        
        CONSIDERATION("CONSIDERATION"),
        
        WEB_CONVERSION("WEB_CONVERSION"),
        
        CATALOG_SALES("CATALOG_SALES"),
        
        VIDEO_COMPLETION("VIDEO_COMPLETION"),
        
        SALES("SALES");

private String value;

AudienceObjectiveType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static AudienceObjectiveType fromValue(String text) {
for (AudienceObjectiveType b : AudienceObjectiveType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


