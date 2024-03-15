package org.openapitools.model;

import io.swagger.annotations.ApiModel;


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
  public String toString() {
    return String.valueOf(value);
  }

  public static OrderLinePaidType fromValue(String value) {
    for (OrderLinePaidType b : OrderLinePaidType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

}

