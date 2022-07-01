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
 * Campaign placement group type
 */

/**
 * Campaign placement group type
 */
public enum PlacementGroupType {
    
        ALL("ALL"),
        
        SEARCH("SEARCH"),
        
        BROWSE("BROWSE"),
        
        OTHER("OTHER");

private String value;

PlacementGroupType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static PlacementGroupType fromValue(String text) {
for (PlacementGroupType b : PlacementGroupType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


