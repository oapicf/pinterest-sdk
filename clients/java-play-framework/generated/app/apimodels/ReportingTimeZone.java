package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/) Specify the timezone to be applied for the reporting.
 */
public enum ReportingTimeZone {
  
  PINTEREST_TIME_ZONE("PINTEREST_TIME_ZONE"),
  
  AD_ACCOUNT_TIME_ZONE("AD_ACCOUNT_TIME_ZONE");

  private final String value;

  ReportingTimeZone(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ReportingTimeZone fromValue(String value) {
    for (ReportingTimeZone b : ReportingTimeZone.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

