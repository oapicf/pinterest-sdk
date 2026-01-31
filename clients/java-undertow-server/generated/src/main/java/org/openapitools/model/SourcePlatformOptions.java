/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.23.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * List of source platforms for a conversion event.
 */

/**
 * List of source platforms for a conversion event.
 */
public enum SourcePlatformOptions {
    
        WEB("WEB"),
        
        MOBILE("MOBILE"),
        
        MOBILE_ANDROID("MOBILE_ANDROID"),
        
        MOBILE_IOS("MOBILE_IOS"),
        
        OFFLINE("OFFLINE"),
        
        PINTEREST_WEB("PINTEREST_WEB"),
        
        PINTEREST_ANDROID("PINTEREST_ANDROID"),
        
        PINTEREST_IOS("PINTEREST_IOS"),
        
        POINT_OF_SALE("POINT_OF_SALE");

private String value;

SourcePlatformOptions(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static SourcePlatformOptions fromValue(String text) {
for (SourcePlatformOptions b : SourcePlatformOptions.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


