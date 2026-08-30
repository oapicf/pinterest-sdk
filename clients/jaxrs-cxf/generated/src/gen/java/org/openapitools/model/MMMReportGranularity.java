package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets MMMReportGranularity
 */
public enum MMMReportGranularity {
  
  DAY("DAY"),
  
  WEEK("WEEK");

  private String value;

  MMMReportGranularity(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static MMMReportGranularity fromValue(String value) {
    for (MMMReportGranularity b : MMMReportGranularity.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

