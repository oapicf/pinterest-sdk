package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets ConversionAttributionWindowDays
 */
public enum ConversionAttributionWindowDays {
  
  NUMBER_1(1),
  
  NUMBER_7(7),
  
  NUMBER_30(30),
  
  NUMBER_60(60);

  private final Integer value;

  ConversionAttributionWindowDays(Integer value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ConversionAttributionWindowDays fromValue(Integer value) {
    for (ConversionAttributionWindowDays b : ConversionAttributionWindowDays.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

