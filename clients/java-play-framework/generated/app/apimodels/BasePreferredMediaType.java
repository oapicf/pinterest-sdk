package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets BasePreferredMediaType
 */
public enum BasePreferredMediaType {
  
  VIDEO("VIDEO"),
  
  IMAGE("IMAGE");

  private final String value;

  BasePreferredMediaType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static BasePreferredMediaType fromValue(String value) {
    for (BasePreferredMediaType b : BasePreferredMediaType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

