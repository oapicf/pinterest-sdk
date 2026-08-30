package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Level of the report
 */
public enum ConversionProductReportLevel {
  
  ADVERTISER("ADVERTISER"),
  
  CAMPAIGN("CAMPAIGN"),
  
  AD_GROUP("AD_GROUP");

  private final String value;

  ConversionProductReportLevel(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ConversionProductReportLevel fromValue(String value) {
    for (ConversionProductReportLevel b : ConversionProductReportLevel.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

