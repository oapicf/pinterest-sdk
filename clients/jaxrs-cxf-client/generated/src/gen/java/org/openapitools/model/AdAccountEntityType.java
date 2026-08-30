package org.openapitools.model;



/**
 * Specify the entity type to get summary information
 */
public enum AdAccountEntityType {
  
  ADVERTISER("ADVERTISER"),
  
  CAMPAIGN("CAMPAIGN"),
  
  AD_GROUP("AD_GROUP"),
  
  AD("AD");

  private String value;

  AdAccountEntityType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdAccountEntityType fromValue(String value) {
    for (AdAccountEntityType b : AdAccountEntityType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

