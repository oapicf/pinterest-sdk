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
 * Days in lookback window in the GET Conversion EQS response.
 */

/**
 * Days in lookback window in the GET Conversion EQS response.
 */
public enum LookbackPeriodOptions {
    
        _1D("1d"),
        
        _14D("14d");

private String value;

LookbackPeriodOptions(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static LookbackPeriodOptions fromValue(String text) {
for (LookbackPeriodOptions b : LookbackPeriodOptions.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


