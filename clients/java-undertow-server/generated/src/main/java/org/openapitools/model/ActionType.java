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
 * Ad group billable event type. For update, only draft ad groups may update billable event.
 */

/**
 * Ad group billable event type. For update, only draft ad groups may update billable event.
 */
public enum ActionType {
    
        CLICKTHROUGH("CLICKTHROUGH"),
        
        IMPRESSION("IMPRESSION"),
        
        VIDEO_V_50_MRC("VIDEO_V_50_MRC");

private String value;

ActionType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static ActionType fromValue(String text) {
for (ActionType b : ActionType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


