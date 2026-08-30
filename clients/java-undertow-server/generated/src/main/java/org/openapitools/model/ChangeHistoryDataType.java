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
 * Gets or Sets ChangeHistoryDataType
 */
public enum ChangeHistoryDataType {
    
        STRING("STRING"),
        
        NUMERIC("NUMERIC"),
        
        MICROCURRENCY("MICROCURRENCY"),
        
        DATE("DATE"),
        
        BOOL("BOOL"),
        
        GENDER_LIST("GENDER_LIST"),
        
        AGE_BUCKET_LIST("AGE_BUCKET_LIST"),
        
        APPTYPE_LIST("APPTYPE_LIST"),
        
        COUNTRY_LIST("COUNTRY_LIST"),
        
        LOCALE_LIST("LOCALE_LIST");

private String value;

ChangeHistoryDataType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static ChangeHistoryDataType fromValue(String text) {
for (ChangeHistoryDataType b : ChangeHistoryDataType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


