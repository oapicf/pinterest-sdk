package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * The type of an SSIO order line.
 */
public enum SSIOOrderLineType {
  
  BUDGET("BUDGET"),
  
  PERPETUALS("PERPETUALS");

  private final String value;

  SSIOOrderLineType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SSIOOrderLineType fromValue(String value) {
    for (SSIOOrderLineType b : SSIOOrderLineType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

