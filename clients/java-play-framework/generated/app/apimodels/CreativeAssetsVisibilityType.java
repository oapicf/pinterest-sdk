package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Creative assets visibility.
 */
public enum CreativeAssetsVisibilityType {
  
  VISIBLE("VISIBLE"),
  
  HIDDEN("HIDDEN");

  private final String value;

  CreativeAssetsVisibilityType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CreativeAssetsVisibilityType fromValue(String value) {
    for (CreativeAssetsVisibilityType b : CreativeAssetsVisibilityType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

