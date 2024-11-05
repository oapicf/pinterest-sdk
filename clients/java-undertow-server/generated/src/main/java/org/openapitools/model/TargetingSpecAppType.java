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
import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Gets or Sets TargetingSpecAppType
 */
public enum TargetingSpecAppType {
    
        ANDROID_MOBILE("android_mobile"),
        
        ANDROID_TABLET("android_tablet"),
        
        IPAD("ipad"),
        
        IPHONE("iphone"),
        
        WEB("web"),
        
        WEB_MOBILE("web_mobile");

private String value;

TargetingSpecAppType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static TargetingSpecAppType fromValue(String text) {
for (TargetingSpecAppType b : TargetingSpecAppType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


