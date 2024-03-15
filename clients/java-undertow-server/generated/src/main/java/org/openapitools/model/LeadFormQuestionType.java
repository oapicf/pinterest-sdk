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
 * Lead form question type
 */

/**
 * Lead form question type
 */
public enum LeadFormQuestionType {
    
        CUSTOM("CUSTOM"),
        
        FULL_NAME("FULL_NAME"),
        
        FIRST_NAME("FIRST_NAME"),
        
        LAST_NAME("LAST_NAME"),
        
        EMAIL("EMAIL"),
        
        PHONE_NUMBER("PHONE_NUMBER"),
        
        ZIP_CODE("ZIP_CODE"),
        
        AGE("AGE"),
        
        GENDER("GENDER"),
        
        CITY("CITY"),
        
        COUNTRY("COUNTRY"),
        
        PREFERRED_CONTACT_METHOD("PREFERRED_CONTACT_METHOD"),
        
        STATE_PROVINCE("STATE_PROVINCE"),
        
        ADDRESS("ADDRESS"),
        
        DATE_OF_BIRTH("DATE_OF_BIRTH");

private String value;

LeadFormQuestionType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static LeadFormQuestionType fromValue(String text) {
for (LeadFormQuestionType b : LeadFormQuestionType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


