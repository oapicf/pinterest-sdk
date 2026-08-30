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
 * Specify the timezone to be applied for the reporting.
 */

/**
 * Specify the timezone to be applied for the reporting.
 */
public enum ReportingTimeZone {
    
        PINTEREST_TIME_ZONE("PINTEREST_TIME_ZONE"),
        
        AD_ACCOUNT_TIME_ZONE("AD_ACCOUNT_TIME_ZONE");

private String value;

ReportingTimeZone(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static ReportingTimeZone fromValue(String text) {
for (ReportingTimeZone b : ReportingTimeZone.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


