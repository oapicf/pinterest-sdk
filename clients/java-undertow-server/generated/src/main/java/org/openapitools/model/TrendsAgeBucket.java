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
import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Gets or Sets TrendsAgeBucket
 */
public enum TrendsAgeBucket {
    
        _18_24("18-24"),
        
        _25_34("25-34"),
        
        _35_44("35-44"),
        
        _45_49("45-49"),
        
        _50_54("50-54"),
        
        _55_64("55-64"),
        
        _65_("65+");

private String value;

TrendsAgeBucket(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static TrendsAgeBucket fromValue(String text) {
for (TrendsAgeBucket b : TrendsAgeBucket.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


