package org.openapitools.model;

import io.swagger.annotations.ApiModel;


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
  public String toString() {
    return String.valueOf(value);
  }

  public static AudienceType fromValue(String value) {
    for (AudienceType b : AudienceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

