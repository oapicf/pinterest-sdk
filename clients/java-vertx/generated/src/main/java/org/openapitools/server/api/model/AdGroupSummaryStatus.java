package org.openapitools.server.api.model;

import java.util.Objects;

/**
 * Summary status for ad group
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Summary status for ad group
 */
public enum AdGroupSummaryStatus {
  
  RUNNING("RUNNING"),
  
  PAUSED("PAUSED"),
  
  NOT_STARTED("NOT_STARTED"),
  
  COMPLETED("COMPLETED"),
  
  ADVERTISER_DISABLED("ADVERTISER_DISABLED"),
  
  ARCHIVED("ARCHIVED"),
  
  DRAFT("DRAFT"),
  
  DELETED_DRAFT("DELETED_DRAFT");

  private String value;

  AdGroupSummaryStatus(String value) {
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

  public static AdGroupSummaryStatus fromValue(String value) {
    for (AdGroupSummaryStatus b : AdGroupSummaryStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}