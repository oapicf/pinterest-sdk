package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets ProductCondition
 */
public enum ProductCondition {
  
  NEW("NEW"),
  
  USED("USED"),
  
  REFURBISHED("REFURBISHED");

  private final String value;

  ProductCondition(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ProductCondition fromValue(String value) {
    for (ProductCondition b : ProductCondition.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

