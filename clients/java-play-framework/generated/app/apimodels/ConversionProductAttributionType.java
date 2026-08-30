package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Conversion product attribution level
 */
public enum ConversionProductAttributionType {
  
  DEFAULT("DEFAULT"),
  
  BRAND_ATTRIBUTION("BRAND_ATTRIBUTION");

  private final String value;

  ConversionProductAttributionType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ConversionProductAttributionType fromValue(String value) {
    for (ConversionProductAttributionType b : ConversionProductAttributionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

