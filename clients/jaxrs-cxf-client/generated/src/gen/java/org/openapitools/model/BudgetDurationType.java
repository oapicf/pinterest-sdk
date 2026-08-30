package org.openapitools.model;



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

