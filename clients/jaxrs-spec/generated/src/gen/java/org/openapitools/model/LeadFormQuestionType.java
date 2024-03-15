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

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static LeadFormQuestionType fromString(String s) {
      for (LeadFormQuestionType b : LeadFormQuestionType.values()) {
        // using Objects.toString() to be safe if value type non-object type
        // because types like 'int' etc. will be auto-boxed
        if (java.util.Objects.toString(b.value).equals(s)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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


