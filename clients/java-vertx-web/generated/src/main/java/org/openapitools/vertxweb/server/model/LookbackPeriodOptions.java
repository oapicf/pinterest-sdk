package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Days in lookback window in the GET Conversion EQS response.
 **/
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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LookbackPeriodOptions fromValue(String value) {
    for (LookbackPeriodOptions b : LookbackPeriodOptions.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}