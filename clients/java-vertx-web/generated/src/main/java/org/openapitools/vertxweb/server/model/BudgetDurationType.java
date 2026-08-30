package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Budget duration type for delivery estimates.
 **/
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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BudgetDurationType fromValue(String value) {
    for (BudgetDurationType b : BudgetDurationType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}