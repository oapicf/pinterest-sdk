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
 * Platform options for AppsFlyer audience
 */

/**
 * Platform options for AppsFlyer audience
 */
public enum AppsflyerPlatform {
    
        ANDROID("android"),
        
        IOS("ios");

private String value;

AppsflyerPlatform(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static AppsflyerPlatform fromValue(String text) {
for (AppsflyerPlatform b : AppsflyerPlatform.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


