package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID, also known as \"Pinterest Performance+ bidding\".
 */
public enum BidStrategyType {
  
  AUTOMATIC_BID("AUTOMATIC_BID"),
  
  MAX_BID("MAX_BID"),
  
  TARGET_AVG("TARGET_AVG");

  private final String value;

  BidStrategyType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static BidStrategyType fromValue(String value) {
    for (BidStrategyType b : BidStrategyType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

