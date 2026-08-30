package org.openapitools.model;



/**
 * Specify if the promotion is applied at ad group or item level.
 */
public enum PromotionApplicationLevel {
  
  NONE("NONE"),
  
  ITEM("ITEM"),
  
  AD_GROUP("AD_GROUP");

  private String value;

  PromotionApplicationLevel(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PromotionApplicationLevel fromValue(String value) {
    for (PromotionApplicationLevel b : PromotionApplicationLevel.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

}

