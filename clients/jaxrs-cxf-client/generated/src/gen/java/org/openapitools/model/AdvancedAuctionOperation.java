package org.openapitools.model;



/**
 * Gets or Sets AdvancedAuctionOperation
 */
public enum AdvancedAuctionOperation {
  
  UPSERT("UPSERT"),
  
  DELETE("DELETE");

  private String value;

  AdvancedAuctionOperation(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdvancedAuctionOperation fromValue(String value) {
    for (AdvancedAuctionOperation b : AdvancedAuctionOperation.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

