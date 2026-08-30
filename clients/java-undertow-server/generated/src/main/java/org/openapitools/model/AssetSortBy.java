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
 * The field to sort member assets by
 */

/**
 * The field to sort member assets by
 */
public enum AssetSortBy {
    
        NAME("NAME"),
        
        ID("ID"),
        
        PERMISSIONS("PERMISSIONS");

private String value;

AssetSortBy(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static AssetSortBy fromValue(String text) {
for (AssetSortBy b : AssetSortBy.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


