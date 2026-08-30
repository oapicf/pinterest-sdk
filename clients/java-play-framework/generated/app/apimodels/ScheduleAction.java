package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * The schedule action
 */
public enum ScheduleAction {
  
  INCREASE_BY_VALUE("INCREASE_BY_VALUE"),
  
  INCREASE_BY_PERCENT("INCREASE_BY_PERCENT");

  private final String value;

  ScheduleAction(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ScheduleAction fromValue(String value) {
    for (ScheduleAction b : ScheduleAction.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

