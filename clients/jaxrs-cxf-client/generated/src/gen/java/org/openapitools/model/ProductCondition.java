package org.openapitools.model;



/**
 * Gets or Sets ProductCondition
 */
public enum ProductCondition {
  
  NEW("NEW"),
  
  USED("USED"),
  
  REFURBISHED("REFURBISHED");

  private String value;

  ProductCondition(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProductCondition fromValue(String value) {
    for (ProductCondition b : ProductCondition.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

