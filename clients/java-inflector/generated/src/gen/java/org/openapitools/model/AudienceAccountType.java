package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;



import com.fasterxml.jackson.annotation.JsonCreator;

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
  public static AudienceAccountType fromValue(String text) {
    for (AudienceAccountType b : AudienceAccountType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


