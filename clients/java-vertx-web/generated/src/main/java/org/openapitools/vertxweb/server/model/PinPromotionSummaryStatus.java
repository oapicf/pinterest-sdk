package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Summary status for pin promotions
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

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

  private String value;

  PinPromotionSummaryStatus(String value) {
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

  public static PinPromotionSummaryStatus fromValue(String value) {
    for (PinPromotionSummaryStatus b : PinPromotionSummaryStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}