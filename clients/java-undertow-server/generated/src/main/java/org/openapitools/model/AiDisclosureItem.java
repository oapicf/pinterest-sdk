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
 * AI disclosure declaration the creator has made about the Pin.
 */

/**
 * AI disclosure declaration the creator has made about the Pin.
 */
public enum AiDisclosureItem {
    
        AI_MODIFIED("AI_MODIFIED"),
        
        SYNTHETIC_PERFORMER("SYNTHETIC_PERFORMER");

private String value;

AiDisclosureItem(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static AiDisclosureItem fromValue(String text) {
for (AiDisclosureItem b : AiDisclosureItem.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


