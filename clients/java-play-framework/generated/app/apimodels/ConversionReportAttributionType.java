package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Attribution type. Refers to the Pinterest Tag endpoints
 */
public enum ConversionReportAttributionType {
  
  INDIVIDUAL("INDIVIDUAL"),
  
  HOUSEHOLD("HOUSEHOLD");

  private final String value;

  ConversionReportAttributionType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ConversionReportAttributionType fromValue(String value) {
    for (ConversionReportAttributionType b : ConversionReportAttributionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

