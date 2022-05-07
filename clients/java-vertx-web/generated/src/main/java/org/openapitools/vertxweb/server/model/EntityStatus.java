package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Entity status
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Entity status
 */
public enum EntityStatus {
  
  ACTIVE("ACTIVE"),
  
  PAUSED("PAUSED"),
  
  ARCHIVED("ARCHIVED");

  private String value;

  EntityStatus(String value) {
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

  public static EntityStatus fromValue(String value) {
    for (EntityStatus b : EntityStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}