package org.openapitools.model;

import io.swagger.annotations.ApiModel;


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
  public String toString() {
    return String.valueOf(value);
  }

  public static ConversionReportAttributionType fromValue(String value) {
    for (ConversionReportAttributionType b : ConversionReportAttributionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

