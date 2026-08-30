package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets FrequencyGoalMetadataTimerange
 */
public enum FrequencyGoalMetadataTimerange {
  
  THIRTY_DAY("THIRTY_DAY"),
  
  DAY("DAY"),
  
  SEVEN_DAY("SEVEN_DAY"),
  
  TWENTY_MINUTE("TWENTY_MINUTE"),
  
  TEN_MINUTE("TEN_MINUTE"),
  
  TWENTY_FOUR_HOUR("TWENTY_FOUR_HOUR");

  private final String value;

  FrequencyGoalMetadataTimerange(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static FrequencyGoalMetadataTimerange fromValue(String value) {
    for (FrequencyGoalMetadataTimerange b : FrequencyGoalMetadataTimerange.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

