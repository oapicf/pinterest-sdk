/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.3.0
 * Maintained by: blah@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Attribution type. Refers to the Pinterest Tag endpoints
 */

/**
 * Attribution type. Refers to the Pinterest Tag endpoints
 */
public enum ConversionReportAttributionType {
    
        INDIVIDUAL("INDIVIDUAL"),
        
        HOUSEHOLD("HOUSEHOLD");

private String value;

ConversionReportAttributionType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static ConversionReportAttributionType fromValue(String text) {
for (ConversionReportAttributionType b : ConversionReportAttributionType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


