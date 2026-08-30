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
 * Reason why a product pin is ineligible for tagging.
 */

/**
 * Reason why a product pin is ineligible for tagging.
 */
public enum IneligibleProductTagReason {
    
        PIN_MISSING("PIN_MISSING"),
        
        PIN_IS_PRIVATE("PIN_IS_PRIVATE"),
        
        PRODUCT_METADATA_MISSING("PRODUCT_METADATA_MISSING"),
        
        PIN_NOT_FROM_VERIFIED_DOMAIN("PIN_NOT_FROM_VERIFIED_DOMAIN"),
        
        PIN_NOT_FROM_SAME_USER_AS_HERO_PIN("PIN_NOT_FROM_SAME_USER_AS_HERO_PIN");

private String value;

IneligibleProductTagReason(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static IneligibleProductTagReason fromValue(String text) {
for (IneligibleProductTagReason b : IneligibleProductTagReason.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


