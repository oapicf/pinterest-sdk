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
 * Reporting columns for sync reporting data filter
 */

/**
 * Reporting columns for sync reporting data filter
 */
public enum AdsAnalyticsFilterColumn {
    
        SPEND_IN_DOLLAR("SPEND_IN_DOLLAR"),
        
        TOTAL_IMPRESSION("TOTAL_IMPRESSION");

private String value;

AdsAnalyticsFilterColumn(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static AdsAnalyticsFilterColumn fromValue(String text) {
for (AdsAnalyticsFilterColumn b : AdsAnalyticsFilterColumn.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


