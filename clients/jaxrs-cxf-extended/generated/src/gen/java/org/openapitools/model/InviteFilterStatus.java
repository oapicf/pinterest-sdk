package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

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

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static InviteFilterStatus fromValue(String value) {
    for (InviteFilterStatus b : InviteFilterStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

