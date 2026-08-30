package org.openapitools.model;



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
  public String toString() {
    return String.valueOf(value);
  }

  public static DeliveryEstimateObjectiveType fromValue(String value) {
    for (DeliveryEstimateObjectiveType b : DeliveryEstimateObjectiveType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

