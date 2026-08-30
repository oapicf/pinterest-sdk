package org.openapitools.model;



/**
 * Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID, also known as \&quot;Pinterest Performance+ bidding\&quot;.
 */
public enum BidStrategyType {
  
  AUTOMATIC_BID("AUTOMATIC_BID"),
  
  MAX_BID("MAX_BID"),
  
  TARGET_AVG("TARGET_AVG");

  private String value;

  BidStrategyType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BidStrategyType fromValue(String value) {
    for (BidStrategyType b : BidStrategyType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

}

