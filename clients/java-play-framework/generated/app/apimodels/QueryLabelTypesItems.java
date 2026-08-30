package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets QueryLabelTypesItems
 */
public enum QueryLabelTypesItems {
  
  BRAND("BRAND"),
  
  CUSTOM("CUSTOM");

  private final String value;

  QueryLabelTypesItems(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static QueryLabelTypesItems fromValue(String value) {
    for (QueryLabelTypesItems b : QueryLabelTypesItems.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

