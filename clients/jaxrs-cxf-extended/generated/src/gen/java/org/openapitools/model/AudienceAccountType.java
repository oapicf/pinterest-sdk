package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets AudienceAccountType
 */
public enum AudienceAccountType {
  
  AD_ACCOUNT("AD_ACCOUNT"),
  
  BUSINESS_ACCOUNT("BUSINESS_ACCOUNT");

  private String value;

  AudienceAccountType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AudienceAccountType fromValue(String value) {
    for (AudienceAccountType b : AudienceAccountType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

