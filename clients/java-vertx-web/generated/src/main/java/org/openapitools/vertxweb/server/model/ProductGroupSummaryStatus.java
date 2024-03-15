package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Summary status for product group
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Summary status for product group
 */
public enum ProductGroupSummaryStatus {
  
  RUNNING("RUNNING"),
  
  PAUSED("PAUSED"),
  
  EXCLUDED("EXCLUDED"),
  
  ARCHIVED("ARCHIVED");

  private String value;

  ProductGroupSummaryStatus(String value) {
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

  public static ProductGroupSummaryStatus fromValue(String value) {
    for (ProductGroupSummaryStatus b : ProductGroupSummaryStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}