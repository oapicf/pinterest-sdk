package com.prokarma.pkmst.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Objective type for delivery estimates.
 */
public enum DeliveryEstimateObjectiveType {
  
  AWARENESS("AWARENESS"),
  
  CONSIDERATION("CONSIDERATION"),
  
  CATALOG_SALES("CATALOG_SALES"),
  
  WEB_CONVERSION("WEB_CONVERSION");

  private String value;

  DeliveryEstimateObjectiveType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static DeliveryEstimateObjectiveType fromValue(String text) {
    for (DeliveryEstimateObjectiveType b : DeliveryEstimateObjectiveType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

