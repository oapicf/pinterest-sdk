/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.12.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Filter operator for sync reporting
 */

/**
 * Filter operator for sync reporting
 */
public enum AdsAnalyticsFilterOperator {
    
        LESS_THAN("LESS_THAN"),
        
        GREATER_THAN("GREATER_THAN");

private String value;

AdsAnalyticsFilterOperator(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static AdsAnalyticsFilterOperator fromValue(String text) {
for (AdsAnalyticsFilterOperator b : AdsAnalyticsFilterOperator.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


