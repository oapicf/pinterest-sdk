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
 * The names of fields that business accounts are searched by
 */

/**
 * The names of fields that business accounts are searched by
 */
public enum BusinessSearchBy {
    
        FULL_NAME("FULL_NAME"),
        
        USERNAME("USERNAME"),
        
        BUSINESS_ID("BUSINESS_ID"),
        
        EMAIL("EMAIL");

private String value;

BusinessSearchBy(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static BusinessSearchBy fromValue(String text) {
for (BusinessSearchBy b : BusinessSearchBy.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


