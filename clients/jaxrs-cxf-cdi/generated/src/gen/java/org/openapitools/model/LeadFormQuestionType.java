package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Lead form question type
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum LeadFormQuestionType {

    @JsonProperty("CUSTOM") CUSTOM(String.valueOf("CUSTOM")), @JsonProperty("FULL_NAME") FULL_NAME(String.valueOf("FULL_NAME")), @JsonProperty("FIRST_NAME") FIRST_NAME(String.valueOf("FIRST_NAME")), @JsonProperty("LAST_NAME") LAST_NAME(String.valueOf("LAST_NAME")), @JsonProperty("EMAIL") EMAIL(String.valueOf("EMAIL")), @JsonProperty("PHONE_NUMBER") PHONE_NUMBER(String.valueOf("PHONE_NUMBER")), @JsonProperty("ZIP_CODE") ZIP_CODE(String.valueOf("ZIP_CODE")), @JsonProperty("AGE") AGE(String.valueOf("AGE")), @JsonProperty("GENDER") GENDER(String.valueOf("GENDER")), @JsonProperty("CITY") CITY(String.valueOf("CITY")), @JsonProperty("COUNTRY") COUNTRY(String.valueOf("COUNTRY")), @JsonProperty("PREFERRED_CONTACT_METHOD") PREFERRED_CONTACT_METHOD(String.valueOf("PREFERRED_CONTACT_METHOD")), @JsonProperty("STATE_PROVINCE") STATE_PROVINCE(String.valueOf("STATE_PROVINCE")), @JsonProperty("ADDRESS") ADDRESS(String.valueOf("ADDRESS")), @JsonProperty("DATE_OF_BIRTH") DATE_OF_BIRTH(String.valueOf("DATE_OF_BIRTH"));


    private String value;

    LeadFormQuestionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static LeadFormQuestionType fromValue(String value) {
        for (LeadFormQuestionType b : LeadFormQuestionType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



