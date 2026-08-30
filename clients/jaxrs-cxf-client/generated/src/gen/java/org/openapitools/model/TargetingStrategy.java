package org.openapitools.model;



/**
 * Gets or Sets TargetingStrategy
 */
public enum TargetingStrategy {
  
  CHOOSE_YOUR_OWN("CHOOSE_YOUR_OWN"),
  
  FIND_NEW_CUSTOMERS("FIND_NEW_CUSTOMERS"),
  
  RECONNECT_WITH_USERS("RECONNECT_WITH_USERS");

  private String value;

  TargetingStrategy(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TargetingStrategy fromValue(String value) {
    for (TargetingStrategy b : TargetingStrategy.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

