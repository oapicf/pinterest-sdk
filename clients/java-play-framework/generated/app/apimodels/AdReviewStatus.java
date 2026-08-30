package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Ad review status
 */
public enum AdReviewStatus {
  
  OTHER("OTHER"),
  
  PENDING("PENDING"),
  
  REJECTED("REJECTED"),
  
  APPROVED("APPROVED");

  private final String value;

  AdReviewStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AdReviewStatus fromValue(String value) {
    for (AdReviewStatus b : AdReviewStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

