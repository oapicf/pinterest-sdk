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
 * Budget duration type for delivery estimates.
 */

/**
 * Budget duration type for delivery estimates.
 */
public enum BudgetDurationType {
    
        FIXED_DAILY("FIXED_DAILY"),
        
        FLEXIBLE_DAILY("FLEXIBLE_DAILY"),
        
        LIFETIME("LIFETIME");

private String value;

BudgetDurationType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static BudgetDurationType fromValue(String text) {
for (BudgetDurationType b : BudgetDurationType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


