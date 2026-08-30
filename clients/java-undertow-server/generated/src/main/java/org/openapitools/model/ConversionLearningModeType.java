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
 * oCPM learn mode.
 */

/**
 * oCPM learn mode.
 */
public enum ConversionLearningModeType {
    
        NOT_ACTIVE("NOT_ACTIVE"),
        
        ACTIVE("ACTIVE");

private String value;

ConversionLearningModeType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static ConversionLearningModeType fromValue(String text) {
for (ConversionLearningModeType b : ConversionLearningModeType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
return null;
}
}


