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
 * Gets or Sets AdgroupTrackingFeatureType
 */
public enum AdgroupTrackingFeatureType {
    
        TRENDS("TRENDS"),
        
        CLONE_META("CLONE_META"),
        
        BULK_EDITOR("BULK_EDITOR"),
        
        AD_ROTATION("AD_ROTATION");

private String value;

AdgroupTrackingFeatureType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static AdgroupTrackingFeatureType fromValue(String text) {
for (AdgroupTrackingFeatureType b : AdgroupTrackingFeatureType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


