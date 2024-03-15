package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum LeadFormQuestionType {

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
    
    DATE_OF_BIRTH("DATE_OF_BIRTH")

    private final String value

    LeadFormQuestionType(String value) {
        this.value = value
    }

    String getValue() {
        value
    }

    @Override
    String toString() {
        String.valueOf(value)
    }
}
