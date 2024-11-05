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
 * bid option field to apply operation updates to
 */

/**
 * bid option field to apply operation updates to
 */
public enum UpdateMaskBidOptionField {
    
        BID("BID"),
        
        APP_TYPE_BID_MULTIPLIER_SET("APP_TYPE_BID_MULTIPLIER_SET"),
        
        PLACEMENT_BID_MULTIPLIER_SET("PLACEMENT_BID_MULTIPLIER_SET");

private String value;

UpdateMaskBidOptionField(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static UpdateMaskBidOptionField fromValue(String text) {
for (UpdateMaskBidOptionField b : UpdateMaskBidOptionField.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


