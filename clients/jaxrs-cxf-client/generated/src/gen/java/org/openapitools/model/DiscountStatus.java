package org.openapitools.model;



/**
 * Discount status based on the current time and start and end time of discount
 */
public enum DiscountStatus {
  
  OTHER("OTHER"),
  
  ACTIVE("ACTIVE"),
  
  PAUSED("PAUSED"),
  
  SCHEDULED("SCHEDULED"),
  
  EXPIRED("EXPIRED");

  private String value;

  DiscountStatus(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DiscountStatus fromValue(String value) {
    for (DiscountStatus b : DiscountStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

