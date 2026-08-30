package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets MMMReportLevel
 */
public enum MMMReportLevel {
  
  CAMPAIGN_TARGETING("CAMPAIGN_TARGETING"),
  
  AD_GROUP_TARGETING("AD_GROUP_TARGETING");

  private String value;

  MMMReportLevel(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static MMMReportLevel fromValue(String value) {
    for (MMMReportLevel b : MMMReportLevel.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

