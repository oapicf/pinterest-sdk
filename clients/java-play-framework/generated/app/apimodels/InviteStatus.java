package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
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

  private final String value;

  InviteStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static InviteStatus fromValue(String value) {
    for (InviteStatus b : InviteStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

