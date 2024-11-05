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
import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Gets or Sets ConversionAttributionWindowDays
 */
public enum ConversionAttributionWindowDays {
    
        NUMBER_0(0),
        
        NUMBER_1(1),
        
        NUMBER_7(7),
        
        NUMBER_14(14),
        
        NUMBER_30(30),
        
        NUMBER_60(60);

private Integer value;

ConversionAttributionWindowDays(Integer value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static ConversionAttributionWindowDays fromValue(String text) {
for (ConversionAttributionWindowDays b : ConversionAttributionWindowDays.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


