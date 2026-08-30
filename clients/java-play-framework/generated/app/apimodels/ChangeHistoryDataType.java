package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets ChangeHistoryDataType
 */
public enum ChangeHistoryDataType {
  
  STRING("STRING"),
  
  NUMERIC("NUMERIC"),
  
  MICROCURRENCY("MICROCURRENCY"),
  
  DATE("DATE"),
  
  BOOL("BOOL"),
  
  GENDER_LIST("GENDER_LIST"),
  
  AGE_BUCKET_LIST("AGE_BUCKET_LIST"),
  
  APPTYPE_LIST("APPTYPE_LIST"),
  
  COUNTRY_LIST("COUNTRY_LIST"),
  
  LOCALE_LIST("LOCALE_LIST");

  private final String value;

  ChangeHistoryDataType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ChangeHistoryDataType fromValue(String value) {
    for (ChangeHistoryDataType b : ChangeHistoryDataType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

