package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;



import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets ProductCondition
 */
public enum ProductCondition {
  
  NEW("NEW"),
  
  USED("USED"),
  
  REFURBISHED("REFURBISHED");

  private String value;

  ProductCondition(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ProductCondition fromValue(String text) {
    for (ProductCondition b : ProductCondition.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


