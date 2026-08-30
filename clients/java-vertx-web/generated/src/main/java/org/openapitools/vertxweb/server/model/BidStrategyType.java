package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID, also known as \&quot;Pinterest Performance+ bidding\&quot;.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

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

  @JsonValue
  public String getValue() {
    return value;
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
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}