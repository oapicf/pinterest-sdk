package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;



import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets TargetingSpecAgeBucket
 */
public enum TargetingSpecAgeBucket {
  
  _18_24("18-24"),
  
  _19_("19+"),
  
  _20_("20+"),
  
  _21_("21+"),
  
  _25_34("25-34"),
  
  _35_44("35-44"),
  
  _45_49("45-49"),
  
  _50_54("50-54"),
  
  _55_64("55-64"),
  
  _65_("65+");

  private String value;

  TargetingSpecAgeBucket(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TargetingSpecAgeBucket fromValue(String text) {
    for (TargetingSpecAgeBucket b : TargetingSpecAgeBucket.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


