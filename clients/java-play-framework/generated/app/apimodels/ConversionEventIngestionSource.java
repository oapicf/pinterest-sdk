package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * The source of conversion events ingestion
 */
public enum ConversionEventIngestionSource {
  
  TAG("TAG"),
  
  MMP("MMP"),
  
  FILE_UPLOAD("FILE_UPLOAD"),
  
  CONVERSIONS_API("CONVERSIONS_API"),
  
  NATIVE("NATIVE");

  private final String value;

  ConversionEventIngestionSource(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ConversionEventIngestionSource fromValue(String value) {
    for (ConversionEventIngestionSource b : ConversionEventIngestionSource.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

