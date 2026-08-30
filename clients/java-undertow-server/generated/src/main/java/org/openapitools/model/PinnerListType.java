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
 * Audience type
 */

/**
 * Audience type
 */
public enum PinnerListType {
    
        CUSTOMER_LIST("CUSTOMER_LIST"),
        
        VISITOR("VISITOR"),
        
        ENGAGEMENT("ENGAGEMENT"),
        
        LOOKALIKE("LOOKALIKE"),
        
        ACTALIKE("ACTALIKE"),
        
        PERSONA("PERSONA");

private String value;

PinnerListType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static PinnerListType fromValue(String text) {
for (PinnerListType b : PinnerListType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


