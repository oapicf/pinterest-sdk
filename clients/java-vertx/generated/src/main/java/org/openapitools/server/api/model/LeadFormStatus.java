package org.openapitools.server.api.model;

import java.util.Objects;

/**
 * Status of the lead form
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Status of the lead form
 */
public enum LeadFormStatus {
  
  DRAFT("DRAFT"),
  
  ACTIVE("ACTIVE");

  private String value;

  LeadFormStatus(String value) {
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

  public static LeadFormStatus fromValue(String value) {
    for (LeadFormStatus b : LeadFormStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}