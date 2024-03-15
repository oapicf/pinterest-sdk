package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Lead form question type
 **/
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

  @JsonValue
  public String getValue() {
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