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
 * Order Line Paid Type
 */

/**
 * Order Line Paid Type
 */
public enum OrderLinePaidType {
    
        PAID("PAID"),
        
        BONUS("BONUS"),
        
        MAKE_GOOD("MAKE_GOOD"),
        
        TEST("TEST");

private String value;

OrderLinePaidType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static OrderLinePaidType fromValue(String text) {
for (OrderLinePaidType b : OrderLinePaidType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
return null;
}
}


