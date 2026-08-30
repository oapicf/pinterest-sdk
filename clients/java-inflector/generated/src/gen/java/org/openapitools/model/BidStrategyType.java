package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID, also known as \&quot;Pinterest Performance+ bidding\&quot;.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID, also known as \"Pinterest Performance+ bidding\".
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
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static BidStrategyType fromValue(String text) {
    for (BidStrategyType b : BidStrategyType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


