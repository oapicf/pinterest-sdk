package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * The new status you want to give the label, either `ACTIVE` (in use) or no longer in use (`ARCHIVED`).
 */
public enum NullableLabelStatus {
  
  ACTIVE("ACTIVE"),
  
  ARCHIVED("ARCHIVED");

  private final String value;

  NullableLabelStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static NullableLabelStatus fromValue(String value) {
    for (NullableLabelStatus b : NullableLabelStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

