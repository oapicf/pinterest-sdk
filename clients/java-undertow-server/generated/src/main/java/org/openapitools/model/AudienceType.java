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
 * Audience type
 */

/**
 * Audience type
 */
public enum AudienceType {
    
        CUSTOMER_LIST("CUSTOMER_LIST"),
        
        VISITOR("VISITOR"),
        
        ENGAGEMENT("ENGAGEMENT"),
        
        ACTALIKE("ACTALIKE"),
        
        PERSONA("PERSONA");

private String value;

AudienceType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static AudienceType fromValue(String text) {
for (AudienceType b : AudienceType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


