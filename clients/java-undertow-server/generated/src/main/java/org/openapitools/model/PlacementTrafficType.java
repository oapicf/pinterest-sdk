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
 * A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both.
 */

/**
 * A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both.
 */
public enum PlacementTrafficType {
    
        ALL("ALL"),
        
        TWO_COLUMN_FEED("TWO_COLUMN_FEED"),
        
        FULLSCREEN_FEED("FULLSCREEN_FEED");

private String value;

PlacementTrafficType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static PlacementTrafficType fromValue(String text) {
for (PlacementTrafficType b : PlacementTrafficType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
return null;
}
}


