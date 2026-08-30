package org.openapitools.model;



/**
 * Gets or Sets TargetingSpecTargetingStrategyItems
 */
public enum TargetingSpecTargetingStrategyItems {
  
  CHOOSE_YOUR_OWN("CHOOSE_YOUR_OWN"),
  
  FIND_NEW_CUSTOMERS("FIND_NEW_CUSTOMERS"),
  
  RECONNECT_WITH_USERS("RECONNECT_WITH_USERS");

  private String value;

  TargetingSpecTargetingStrategyItems(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TargetingSpecTargetingStrategyItems fromValue(String value) {
    for (TargetingSpecTargetingStrategyItems b : TargetingSpecTargetingStrategyItems.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

