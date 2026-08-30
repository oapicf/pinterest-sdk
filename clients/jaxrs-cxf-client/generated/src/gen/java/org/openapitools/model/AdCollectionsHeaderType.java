package org.openapitools.model;



/**
 * Collections ad header type for ads
 */
public enum AdCollectionsHeaderType {
  
  SHOP_THIS_COLLECTION("SHOP_THIS_COLLECTION"),
  
  EXPLORE_THIS_COLLECTION("EXPLORE_THIS_COLLECTION"),
  
  NO_HEADER("NO_HEADER");

  private String value;

  AdCollectionsHeaderType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdCollectionsHeaderType fromValue(String value) {
    for (AdCollectionsHeaderType b : AdCollectionsHeaderType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

}

