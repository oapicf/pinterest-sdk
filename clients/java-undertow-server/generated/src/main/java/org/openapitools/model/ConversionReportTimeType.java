/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.3.0
 * Maintained by: pinterest-api@pinterest.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Conversion report time type
 */

/**
 * Conversion report time type
 */
public enum ConversionReportTimeType {
    
        AD_ACTION("TIME_OF_AD_ACTION"),
        
        CONVERSION("TIME_OF_CONVERSION");

private String value;

ConversionReportTimeType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static ConversionReportTimeType fromValue(String text) {
for (ConversionReportTimeType b : ConversionReportTimeType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


