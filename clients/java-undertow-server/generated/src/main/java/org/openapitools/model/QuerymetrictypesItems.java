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
import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Gets or Sets QuerymetrictypesItems
 */
public enum QuerymetrictypesItems {
    
        ENGAGEMENT("ENGAGEMENT"),
        
        ENGAGEMENT_RATE("ENGAGEMENT_RATE"),
        
        IMPRESSION("IMPRESSION"),
        
        OUTBOUND_CLICK("OUTBOUND_CLICK"),
        
        OUTBOUND_CLICK_RATE("OUTBOUND_CLICK_RATE"),
        
        PIN_CLICK("PIN_CLICK"),
        
        PIN_CLICK_RATE("PIN_CLICK_RATE"),
        
        SAVE("SAVE"),
        
        SAVE_RATE("SAVE_RATE");

private String value;

QuerymetrictypesItems(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static QuerymetrictypesItems fromValue(String text) {
for (QuerymetrictypesItems b : QuerymetrictypesItems.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


