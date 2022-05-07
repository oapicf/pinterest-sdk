package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Conversion report time type
 */
public enum ConversionReportTimeType {
  
  AD_ACTION("TIME_OF_AD_ACTION"),
  
  CONVERSION("TIME_OF_CONVERSION");

  private String value;

  ConversionReportTimeType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ConversionReportTimeType fromValue(String value) {
    for (ConversionReportTimeType b : ConversionReportTimeType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

