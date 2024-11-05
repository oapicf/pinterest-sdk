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
 * Asset group type
 */

/**
 * Asset group type
 */
public enum AssetGroupType {
    
        BRAND("BRAND"),
        
        LOCATION_OR_LANGUAGE("LOCATION_OR_LANGUAGE"),
        
        PRODUCT_LINE("PRODUCT_LINE"),
        
        OTHER("OTHER");

private String value;

AssetGroupType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static AssetGroupType fromValue(String text) {
for (AssetGroupType b : AssetGroupType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


