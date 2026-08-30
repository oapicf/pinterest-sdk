package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets QueryLabelEntityStatusesItems
 */
public enum QueryLabelEntityStatusesItems {
  
  ACTIVE("ACTIVE"),
  
  ARCHIVED("ARCHIVED");

  private final String value;

  QueryLabelEntityStatusesItems(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static QueryLabelEntityStatusesItems fromValue(String value) {
    for (QueryLabelEntityStatusesItems b : QueryLabelEntityStatusesItems.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

