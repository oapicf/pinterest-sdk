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
 * Gets or Sets QueryLabelTypesItems
 */
public enum QueryLabelTypesItems {
    
        BRAND("BRAND"),
        
        CUSTOM("CUSTOM");

private String value;

QueryLabelTypesItems(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static QueryLabelTypesItems fromValue(String text) {
for (QueryLabelTypesItems b : QueryLabelTypesItems.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


