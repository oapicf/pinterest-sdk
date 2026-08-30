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
 * The field to search member assets by
 */

/**
 * The field to search member assets by
 */
public enum AssetSearchBy {
    
        NAME("NAME"),
        
        ID("ID"),
        
        NAME_OR_ID("NAME_OR_ID"),
        
        OWNER_NAME("OWNER_NAME"),
        
        NAME_OR_OWNER("NAME_OR_OWNER");

private String value;

AssetSearchBy(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static AssetSearchBy fromValue(String text) {
for (AssetSearchBy b : AssetSearchBy.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


