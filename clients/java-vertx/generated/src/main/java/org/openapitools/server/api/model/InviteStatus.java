package org.openapitools.server.api.model;

import java.util.Objects;

/**
 * The current status of the invite.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The current status of the invite.
 */
public enum InviteStatus {
  
  PENDING("PENDING"),
  
  ACCEPTED("ACCEPTED"),
  
  DECLINED("DECLINED"),
  
  CANCELLED("CANCELLED"),
  
  EXPIRED("EXPIRED");

  private String value;

  InviteStatus(String value) {
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

  public static InviteStatus fromValue(String value) {
    for (InviteStatus b : InviteStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}