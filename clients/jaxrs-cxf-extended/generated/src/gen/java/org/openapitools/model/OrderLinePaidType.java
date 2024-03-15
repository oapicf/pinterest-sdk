package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Order Line Paid Type
 */
public enum OrderLinePaidType {
  
  PAID("PAID"),
  
  BONUS("BONUS"),
  
  MAKE_GOOD("MAKE_GOOD"),
  
  TEST("TEST"),
  
  NULL("null");

  private String value;

  OrderLinePaidType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OrderLinePaidType fromValue(String value) {
    for (OrderLinePaidType b : OrderLinePaidType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

}

