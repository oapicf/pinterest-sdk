package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Invite statuses used for filters.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Invite statuses used for filters.
 */
public enum InviteFilterStatus {
  
  PENDING("PENDING"),
  
  EXPIRED("EXPIRED");

  private String value;

  InviteFilterStatus(String value) {
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

  public static InviteFilterStatus fromValue(String value) {
    for (InviteFilterStatus b : InviteFilterStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}