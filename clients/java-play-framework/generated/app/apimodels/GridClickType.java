package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Where a user is taken after clicking on an ad in grid.
 */
public enum GridClickType {
  
  CLOSEUP("CLOSEUP"),
  
  DIRECT_TO_DESTINATION("DIRECT_TO_DESTINATION");

  private final String value;

  GridClickType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static GridClickType fromValue(String value) {
    for (GridClickType b : GridClickType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

