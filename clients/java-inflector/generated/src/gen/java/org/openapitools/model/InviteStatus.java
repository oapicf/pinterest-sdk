package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * The current status of the invite.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

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

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static InviteStatus fromValue(String text) {
    for (InviteStatus b : InviteStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


