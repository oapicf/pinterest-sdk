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
 * The source of conversion events ingestion
 */

/**
 * The source of conversion events ingestion
 */
public enum ConversionEventIngestionSource {
    
        TAG("TAG"),
        
        MMP("MMP"),
        
        FILE_UPLOAD("FILE_UPLOAD"),
        
        CONVERSIONS_API("CONVERSIONS_API"),
        
        NATIVE("NATIVE");

private String value;

ConversionEventIngestionSource(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static ConversionEventIngestionSource fromValue(String text) {
for (ConversionEventIngestionSource b : ConversionEventIngestionSource.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


