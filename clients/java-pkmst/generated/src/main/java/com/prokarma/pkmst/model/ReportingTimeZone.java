package com.prokarma.pkmst.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Specify the timezone to be applied for the reporting.
 */
public enum ReportingTimeZone {
  
  PINTEREST_TIME_ZONE("PINTEREST_TIME_ZONE"),
  
  AD_ACCOUNT_TIME_ZONE("AD_ACCOUNT_TIME_ZONE");

  private String value;

  ReportingTimeZone(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ReportingTimeZone fromValue(String text) {
    for (ReportingTimeZone b : ReportingTimeZone.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

