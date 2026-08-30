package org.openapitools.model;



/**
 * Collections ad header type
 */
public enum CollectionsHeaderType {
  
  SHOP_THIS_COLLECTION("SHOP_THIS_COLLECTION"),
  
  EXPLORE_THIS_COLLECTION("EXPLORE_THIS_COLLECTION"),
  
  NO_HEADER("NO_HEADER"),
  
  ON_SALE("ON_SALE"),
  
  GET_DEAL("GET_DEAL");

  private String value;

  CollectionsHeaderType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CollectionsHeaderType fromValue(String value) {
    for (CollectionsHeaderType b : CollectionsHeaderType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

}

