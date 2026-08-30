package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Budget duration type for delivery estimates.
 */
public enum BudgetDurationType {
  
  FIXED_DAILY("FIXED_DAILY"),
  
  FLEXIBLE_DAILY("FLEXIBLE_DAILY"),
  
  LIFETIME("LIFETIME");

  private String value;

  BudgetDurationType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static BudgetDurationType fromValue(String value) {
    for (BudgetDurationType b : BudgetDurationType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

