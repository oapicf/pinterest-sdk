package org.openapitools.model;



/**
 * Gets or Sets Order
 */
public enum Order {
  
  ASCENDING("ASCENDING"),
  
  DESCENDING("DESCENDING");

  private String value;

  Order(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Order fromValue(String value) {
    for (Order b : Order.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

