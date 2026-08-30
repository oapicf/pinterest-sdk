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
 * Gets or Sets TargetingSpecTargetingStrategyItems
 */
public enum TargetingSpecTargetingStrategyItems {
    
        CHOOSE_YOUR_OWN("CHOOSE_YOUR_OWN"),
        
        FIND_NEW_CUSTOMERS("FIND_NEW_CUSTOMERS"),
        
        RECONNECT_WITH_USERS("RECONNECT_WITH_USERS");

private String value;

TargetingSpecTargetingStrategyItems(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static TargetingSpecTargetingStrategyItems fromValue(String text) {
for (TargetingSpecTargetingStrategyItems b : TargetingSpecTargetingStrategyItems.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


