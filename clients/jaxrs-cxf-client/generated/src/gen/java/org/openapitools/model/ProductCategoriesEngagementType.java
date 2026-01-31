package org.openapitools.model;



/**
 * Gets or Sets ProductCategoriesEngagementType
 */
public enum ProductCategoriesEngagementType {
  
  ENGAGEMENT("ENGAGEMENT"),
  
  OUTBOUND_CLICK("OUTBOUND_CLICK"),
  
  SAVE("SAVE");

  private String value;

  ProductCategoriesEngagementType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProductCategoriesEngagementType fromValue(String value) {
    for (ProductCategoriesEngagementType b : ProductCategoriesEngagementType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

