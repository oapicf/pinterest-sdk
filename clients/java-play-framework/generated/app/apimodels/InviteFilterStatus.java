package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Invite statuses used for filters.
 */
public enum InviteFilterStatus {
  
  PENDING("PENDING"),
  
  EXPIRED("EXPIRED");

  private final String value;

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

