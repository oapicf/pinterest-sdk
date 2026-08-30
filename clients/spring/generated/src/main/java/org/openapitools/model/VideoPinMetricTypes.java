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
 * Video Pin metric types
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public enum VideoPinMetricTypes {
  
  IMPRESSION("IMPRESSION"),
  
  OUTBOUND_CLICK("OUTBOUND_CLICK"),
  
  PIN_CLICK("PIN_CLICK"),
  
  SAVE("SAVE"),
  
  SAVE_RATE("SAVE_RATE"),
  
  VIDEO_MRC_VIEW("VIDEO_MRC_VIEW"),
  
  VIDEO_10_S_VIEW("VIDEO_10S_VIEW"),
  
  QUARTILE_95_PERCENT_VIEW("QUARTILE_95_PERCENT_VIEW"),
  
  VIDEO_V50_WATCH_TIME("VIDEO_V50_WATCH_TIME"),
  
  VIDEO_START("VIDEO_START"),
  
  VIDEO_AVG_WATCH_TIME("VIDEO_AVG_WATCH_TIME"),
  
  TOTAL_COMMENTS("TOTAL_COMMENTS"),
  
  TOTAL_REACTIONS("TOTAL_REACTIONS");

  private final String value;

  VideoPinMetricTypes(String value) {
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
  public static VideoPinMetricTypes fromValue(String value) {
    for (VideoPinMetricTypes b : VideoPinMetricTypes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

