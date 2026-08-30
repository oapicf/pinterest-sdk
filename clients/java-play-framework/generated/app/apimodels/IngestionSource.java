package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets IngestionSource
 */
public enum IngestionSource {
  
  TAG("TAG"),
  
  MMP("MMP"),
  
  FILE_UPLOAD("FILE_UPLOAD"),
  
  CONVERSIONS_API("CONVERSIONS_API"),
  
  NATIVE("NATIVE");

  private final String value;

  IngestionSource(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static IngestionSource fromValue(String value) {
    for (IngestionSource b : IngestionSource.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

