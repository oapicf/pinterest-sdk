package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Account type filter for audience sharing.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Account type filter for audience sharing.
 */
public enum AudienceAccountType {
  
  AD_ACCOUNT("AD_ACCOUNT"),
  
  BUSINESS_ACCOUNT("BUSINESS_ACCOUNT");

  private String value;

  AudienceAccountType(String value) {
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

  public static AudienceAccountType fromValue(String value) {
    for (AudienceAccountType b : AudienceAccountType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}