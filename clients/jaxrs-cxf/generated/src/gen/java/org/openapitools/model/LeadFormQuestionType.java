package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

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
  
  GENDER("GENDER"),
  
  CITY("CITY"),
  
  COUNTRY("COUNTRY"),
  
  STATE_PROVINCE("STATE_PROVINCE"),
  
  ADDRESS("ADDRESS"),
  
  DATE_OF_BIRTH("DATE_OF_BIRTH"),
  
  AGE("AGE");

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
  public static LeadFormQuestionType fromValue(String value) {
    for (LeadFormQuestionType b : LeadFormQuestionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

