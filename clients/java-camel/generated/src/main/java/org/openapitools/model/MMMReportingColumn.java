package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Marketing Mix Modeling (MMM) Reporting Columns
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-03-14T23:03:40.689435566Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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

