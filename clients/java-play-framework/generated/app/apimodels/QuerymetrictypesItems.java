package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets QuerymetrictypesItems
 */
public enum QuerymetrictypesItems {
  
  ENGAGEMENT("ENGAGEMENT"),
  
  ENGAGEMENT_RATE("ENGAGEMENT_RATE"),
  
  IMPRESSION("IMPRESSION"),
  
  OUTBOUND_CLICK("OUTBOUND_CLICK"),
  
  OUTBOUND_CLICK_RATE("OUTBOUND_CLICK_RATE"),
  
  PIN_CLICK("PIN_CLICK"),
  
  PIN_CLICK_RATE("PIN_CLICK_RATE"),
  
  SAVE("SAVE"),
  
  SAVE_RATE("SAVE_RATE");

  private final String value;

  QuerymetrictypesItems(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static QuerymetrictypesItems fromValue(String value) {
    for (QuerymetrictypesItems b : QuerymetrictypesItems.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

