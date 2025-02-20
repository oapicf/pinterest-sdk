package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Marketing Mix Modeling (MMM) Reporting Columns
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Marketing Mix Modeling (MMM) Reporting Columns
 */
public enum MMMReportingColumn {
  
  SPEND_IN_DOLLAR("SPEND_IN_DOLLAR"),
  
  SPEND_IN_MICRO_DOLLAR("SPEND_IN_MICRO_DOLLAR"),
  
  ECPC_IN_DOLLAR("ECPC_IN_DOLLAR"),
  
  ECTR("ECTR"),
  
  CAMPAIGN_NAME("CAMPAIGN_NAME"),
  
  TOTAL_ENGAGEMENT("TOTAL_ENGAGEMENT"),
  
  EENGAGEMENT_RATE("EENGAGEMENT_RATE"),
  
  ECPM_IN_DOLLAR("ECPM_IN_DOLLAR"),
  
  CAMPAIGN_ID("CAMPAIGN_ID"),
  
  ADVERTISER_ID("ADVERTISER_ID"),
  
  AD_GROUP_ID("AD_GROUP_ID"),
  
  AD_GROUP_NAME("AD_GROUP_NAME"),
  
  CLICKTHROUGH_1("CLICKTHROUGH_1"),
  
  IMPRESSION_1("IMPRESSION_1"),
  
  CLICKTHROUGH_2("CLICKTHROUGH_2"),
  
  IMPRESSION_2("IMPRESSION_2"),
  
  TOTAL_CLICKTHROUGH("TOTAL_CLICKTHROUGH"),
  
  TOTAL_IMPRESSION("TOTAL_IMPRESSION"),
  
  ADVERTISER_NAME("ADVERTISER_NAME"),
  
  SPEND_ORDER_LINE_PAID_TYPE("SPEND_ORDER_LINE_PAID_TYPE");

  private String value;

  MMMReportingColumn(String value) {
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

  public static MMMReportingColumn fromValue(String value) {
    for (MMMReportingColumn b : MMMReportingColumn.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}