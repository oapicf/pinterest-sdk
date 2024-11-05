package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

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

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static MetricsReportingLevel fromString(String s) {
      for (MetricsReportingLevel b : MetricsReportingLevel.values()) {
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
  public static MetricsReportingLevel fromValue(String value) {
    for (MetricsReportingLevel b : MetricsReportingLevel.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


