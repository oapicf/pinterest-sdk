package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Reporting template type
 */
public enum MetricsReportingTemplateType {
  
  UNSPECIFIED("UNSPECIFIED"),
  
  BULK("BULK"),
  
  OVERVIEW("OVERVIEW"),
  
  TABLE("TABLE"),
  
  MMM("MMM"),
  
  BRAND_CATEGORY("BRAND_CATEGORY");

  private String value;

  MetricsReportingTemplateType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static MetricsReportingTemplateType fromValue(String value) {
    for (MetricsReportingTemplateType b : MetricsReportingTemplateType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

