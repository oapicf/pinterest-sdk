package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Ad group pacing delivery type. With ACCELERATED, an ad group budget is spent as fast as possible. With STANDARD, an ad group budget is spent smoothly over a day. When using CBO, only the STANDARD pacing delivery type is allowed.
 */
public enum PacingDeliveryType {
  
  STANDARD("STANDARD"),
  
  ACCELERATED("ACCELERATED");

  private String value;

  PacingDeliveryType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PacingDeliveryType fromValue(String value) {
    for (PacingDeliveryType b : PacingDeliveryType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

