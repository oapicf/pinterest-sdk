package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets NullablePartnerType
 */
public enum NullablePartnerType {
  
  INTERNAL("INTERNAL"),
  
  EXTERNAL("EXTERNAL");

  private final String value;

  NullablePartnerType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static NullablePartnerType fromValue(String value) {
    for (NullablePartnerType b : NullablePartnerType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

