package org.openapitools.vertxweb.server.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets FrequencyGoalMetadataTimerange
 */
public enum FrequencyGoalMetadataTimerange {
  
  THIRTY_DAY("THIRTY_DAY"),
  
  DAY("DAY"),
  
  SEVEN_DAY("SEVEN_DAY"),
  
  TWENTY_MINUTE("TWENTY_MINUTE"),
  
  TEN_MINUTE("TEN_MINUTE"),
  
  TWENTY_FOUR_HOUR("TWENTY_FOUR_HOUR");

  private String value;

  FrequencyGoalMetadataTimerange(String value) {
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

  public static FrequencyGoalMetadataTimerange fromValue(String value) {
    for (FrequencyGoalMetadataTimerange b : FrequencyGoalMetadataTimerange.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}