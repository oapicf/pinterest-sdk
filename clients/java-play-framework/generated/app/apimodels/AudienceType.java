package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Audience type
 */
public enum AudienceType {
  
  CUSTOMER_LIST("CUSTOMER_LIST"),
  
  VISITOR("VISITOR"),
  
  ENGAGEMENT("ENGAGEMENT"),
  
  ACTALIKE("ACTALIKE"),
  
  PERSONA("PERSONA");

  private final String value;

  AudienceType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AudienceType fromValue(String value) {
    for (AudienceType b : AudienceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

