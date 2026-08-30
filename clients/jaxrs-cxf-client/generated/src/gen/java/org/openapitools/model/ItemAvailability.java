package org.openapitools.model;



/**
 * Availability of the item
 */
public enum ItemAvailability {
  
  IN_STOCK("in stock"),
  
  OUT_OF_STOCK("out of stock"),
  
  PREORDER("preorder");

  private String value;

  ItemAvailability(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ItemAvailability fromValue(String value) {
    for (ItemAvailability b : ItemAvailability.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

