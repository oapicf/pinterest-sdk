package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Days in lookback window in the GET Conversion EQS response.
 */
public enum LookbackPeriodOptions {
  
  _1D("1d"),
  
  _14D("14d");

  private String value;

  LookbackPeriodOptions(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static LookbackPeriodOptions fromValue(String value) {
    for (LookbackPeriodOptions b : LookbackPeriodOptions.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

