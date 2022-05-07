package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Ad group pacing delivery type
 */
public enum PacingDeliveryType {
  
  STANDARD("STANDARD"),
  
  ACCELERATED("ACCELERATED");

  private String value;

  PacingDeliveryType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PacingDeliveryType fromValue(String text) {
    for (PacingDeliveryType b : PacingDeliveryType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

