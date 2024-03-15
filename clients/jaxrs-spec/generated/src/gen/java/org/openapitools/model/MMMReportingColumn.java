package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

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

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static MMMReportingColumn fromString(String s) {
      for (MMMReportingColumn b : MMMReportingColumn.values()) {
        // using Objects.toString() to be safe if value type non-object type
        // because types like 'int' etc. will be auto-boxed
        if (java.util.Objects.toString(b.value).equals(s)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static MMMReportingColumn fromValue(String value) {
    for (MMMReportingColumn b : MMMReportingColumn.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


