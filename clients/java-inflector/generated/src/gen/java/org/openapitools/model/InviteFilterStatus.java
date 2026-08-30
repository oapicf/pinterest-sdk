package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Invite statuses used for filters.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

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
  public static InviteFilterStatus fromValue(String text) {
    for (InviteFilterStatus b : InviteFilterStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


