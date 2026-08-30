package org.openapitools.model;



/**
 * Gets or Sets AdShoppingPreviewCreativeType
 */
public enum AdShoppingPreviewCreativeType {
  
  SHOPPING("SHOPPING"),
  
  COLLECTION("COLLECTION"),
  
  CAROUSEL("CAROUSEL"),
  
  MAX_WIDTH_COLLECTION("MAX_WIDTH_COLLECTION");

  private String value;

  AdShoppingPreviewCreativeType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdShoppingPreviewCreativeType fromValue(String value) {
    for (AdShoppingPreviewCreativeType b : AdShoppingPreviewCreativeType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

