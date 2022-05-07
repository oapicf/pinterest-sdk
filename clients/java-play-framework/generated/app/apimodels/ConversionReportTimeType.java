package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Conversion report time type
 */
public enum ConversionReportTimeType {
  
  AD_ACTION("TIME_OF_AD_ACTION"),
  
  CONVERSION("TIME_OF_CONVERSION");

  private final String value;

  ConversionReportTimeType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ConversionReportTimeType fromValue(String value) {
    for (ConversionReportTimeType b : ConversionReportTimeType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

