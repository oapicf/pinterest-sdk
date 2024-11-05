package org.openapitools.server.api.model;

import java.util.Objects;

/**
 * Specifies if the partner is internal or external.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Specifies if the partner is internal or external.
 */
public enum BusinessRoleCheckMode {
  
  INTERNAL("INTERNAL"),
  
  EXTERNAL("EXTERNAL");

  private String value;

  BusinessRoleCheckMode(String value) {
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

  public static BusinessRoleCheckMode fromValue(String value) {
    for (BusinessRoleCheckMode b : BusinessRoleCheckMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}