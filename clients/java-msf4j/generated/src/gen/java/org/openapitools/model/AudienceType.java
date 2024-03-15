package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Audience type
 */
public enum AudienceType {
  
  CUSTOMER_LIST("CUSTOMER_LIST"),
  
  VISITOR("VISITOR"),
  
  ENGAGEMENT("ENGAGEMENT"),
  
  ACTALIKE("ACTALIKE"),
  
  PERSONA("PERSONA");

  private String value;

  AudienceType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AudienceType fromValue(String text) {
    for (AudienceType b : AudienceType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

