package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets FrequencyGoalMetadataTimerange
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public enum FrequencyGoalMetadataTimerange {
  
  THIRTY_DAY("THIRTY_DAY"),
  
  DAY("DAY"),
  
  SEVEN_DAY("SEVEN_DAY"),
  
  TWENTY_MINUTE("TWENTY_MINUTE"),
  
  TEN_MINUTE("TEN_MINUTE"),
  
  TWENTY_FOUR_HOUR("TWENTY_FOUR_HOUR");

  private final String value;

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

  @JsonCreator
  public static FrequencyGoalMetadataTimerange fromValue(String value) {
    for (FrequencyGoalMetadataTimerange b : FrequencyGoalMetadataTimerange.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

