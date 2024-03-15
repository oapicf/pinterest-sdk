package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Summary status for pin promotions
 */
public enum PinPromotionSummaryStatus {
  
  APPROVED("APPROVED"),
  
  PAUSED("PAUSED"),
  
  PENDING("PENDING"),
  
  REJECTED("REJECTED"),
  
  ADVERTISER_DISABLED("ADVERTISER_DISABLED"),
  
  ARCHIVED("ARCHIVED"),
  
  DRAFT("DRAFT"),
  
  DELETED_DRAFT("DELETED_DRAFT");

  private final String value;

  PinPromotionSummaryStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PinPromotionSummaryStatus fromValue(String value) {
    for (PinPromotionSummaryStatus b : PinPromotionSummaryStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

