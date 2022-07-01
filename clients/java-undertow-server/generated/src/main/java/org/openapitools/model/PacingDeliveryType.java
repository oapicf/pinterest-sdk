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
 * Ad group pacing delivery type
 */

/**
 * Ad group pacing delivery type
 */
public enum PacingDeliveryType {
    
        STANDARD("STANDARD"),
        
        ACCELERATED("ACCELERATED");

private String value;

PacingDeliveryType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static PacingDeliveryType fromValue(String text) {
for (PacingDeliveryType b : PacingDeliveryType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


