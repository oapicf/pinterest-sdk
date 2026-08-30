package org.openapitools.model;



/**
 * Product availability.
 */
public enum ProductAvailability {
  
  IN_STOCK("IN_STOCK"),
  
  OUT_OF_STOCK("OUT_OF_STOCK"),
  
  PREORDER("PREORDER");

  private String value;

  ProductAvailability(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProductAvailability fromValue(String value) {
    for (ProductAvailability b : ProductAvailability.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

