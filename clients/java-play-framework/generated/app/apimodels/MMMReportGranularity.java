package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets MMMReportGranularity
 */
public enum MMMReportGranularity {
  
  DAY("DAY"),
  
  WEEK("WEEK");

  private final String value;

  MMMReportGranularity(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static MMMReportGranularity fromValue(String value) {
    for (MMMReportGranularity b : MMMReportGranularity.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

