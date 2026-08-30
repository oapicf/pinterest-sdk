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
 * Campaign placement group type
 */

/**
 * Campaign placement group type
 */
public enum AdgroupPlacementGroupType {
    
        ALL("ALL"),
        
        SEARCH("SEARCH"),
        
        BROWSE("BROWSE"),
        
        OTHER("OTHER");

private String value;

AdgroupPlacementGroupType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static AdgroupPlacementGroupType fromValue(String text) {
for (AdgroupPlacementGroupType b : AdgroupPlacementGroupType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


