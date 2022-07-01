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
 * Level of the reporting request
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2022-07-01T12:00:23.697640Z[Etc/UTC]")
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
  
  PRODUCT_ITEM("PRODUCT_ITEM");

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

  @JsonCreator
  public static MetricsReportingLevel fromValue(String value) {
    for (MetricsReportingLevel b : MetricsReportingLevel.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

