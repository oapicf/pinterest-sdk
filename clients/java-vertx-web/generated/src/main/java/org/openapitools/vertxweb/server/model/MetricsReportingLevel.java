package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Level of the reporting request
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Level of the reporting request
 */
public enum MetricsReportingLevel {
  
  ADVERTISER("ADVERTISER"),
  
  ADVERTISER_TARGETING("ADVERTISER_TARGETING"),
  
  CAMPAIGN("CAMPAIGN"),
  
  CAMPAIGN_TARGETING("CAMPAIGN_TARGETING"),
  
  AD_GROUP("AD_GROUP"),
  
  AD_GROUP_TARGETING("AD_GROUP_TARGETING"),
  
  PIN_PROMOTION("PIN_PROMOTION"),
  
  PIN_PROMOTION_TARGETING("PIN_PROMOTION_TARGETING"),
  
  KEYWORD("KEYWORD"),
  
  PRODUCT_GROUP("PRODUCT_GROUP"),
  
  PRODUCT_GROUP_TARGETING("PRODUCT_GROUP_TARGETING"),
  
  PRODUCT_ITEM("PRODUCT_ITEM"),
  
  PRODUCT_ITEM_TARGETING("PRODUCT_ITEM_TARGETING");

  private String value;

  MetricsReportingLevel(String value) {
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

  public static MetricsReportingLevel fromValue(String value) {
    for (MetricsReportingLevel b : MetricsReportingLevel.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}