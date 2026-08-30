package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Indicate targeting template is active or Deleted
 */
public enum TargetingTemplateStatus {
  
  ACTIVE("ACTIVE"),
  
  DELETED("DELETED");

  private final String value;

  TargetingTemplateStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TargetingTemplateStatus fromValue(String value) {
    for (TargetingTemplateStatus b : TargetingTemplateStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

