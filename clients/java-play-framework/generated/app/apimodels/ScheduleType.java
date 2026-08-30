package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * The schedule type
 */
public enum ScheduleType {
  
  CAMPAIGN_BUDGET_CHANGE("CAMPAIGN_BUDGET_CHANGE"),
  
  CAMPAIGN_BID_MULTIPLIERS("CAMPAIGN_BID_MULTIPLIERS");

  private final String value;

  ScheduleType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ScheduleType fromValue(String value) {
    for (ScheduleType b : ScheduleType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

