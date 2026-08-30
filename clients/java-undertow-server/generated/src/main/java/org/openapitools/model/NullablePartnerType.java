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
 * Gets or Sets NullablePartnerType
 */
public enum NullablePartnerType {
    
        INTERNAL("INTERNAL"),
        
        EXTERNAL("EXTERNAL");

private String value;

NullablePartnerType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static NullablePartnerType fromValue(String text) {
for (NullablePartnerType b : NullablePartnerType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
return null;
}
}


