package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Billing profile status
 */
public enum BillingProfileStatus {
  
  UNSPECIFIED("UNSPECIFIED"),
  
  VALID("VALID"),
  
  INVALID("INVALID"),
  
  PENDING("PENDING"),
  
  DELETED("DELETED"),
  
  SECONDARY("SECONDARY"),
  
  PENDING_SECONDARY("PENDING_SECONDARY");

  private final String value;

  BillingProfileStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static BillingProfileStatus fromValue(String value) {
    for (BillingProfileStatus b : BillingProfileStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

