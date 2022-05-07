package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Attribution type. Refers to the Pinterest Tag endpoints
 */
public enum ConversionReportAttributionType {
  
  INDIVIDUAL("INDIVIDUAL"),
  
  HOUSEHOLD("HOUSEHOLD");

  private String value;

  ConversionReportAttributionType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ConversionReportAttributionType fromValue(String value) {
    for (ConversionReportAttributionType b : ConversionReportAttributionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


