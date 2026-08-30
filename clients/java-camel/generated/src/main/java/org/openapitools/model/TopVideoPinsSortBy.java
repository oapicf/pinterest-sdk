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
 * Sort metric for top video pins analytics.
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public enum TopVideoPinsSortBy {
  
  SAVE("SAVE"),
  
  IMPRESSION("IMPRESSION"),
  
  OUTBOUND_CLICK("OUTBOUND_CLICK"),
  
  VIDEO_MRC_VIEW("VIDEO_MRC_VIEW"),
  
  VIDEO_AVG_WATCH_TIME("VIDEO_AVG_WATCH_TIME"),
  
  VIDEO_V50_WATCH_TIME("VIDEO_V50_WATCH_TIME"),
  
  QUARTILE_95_PERCENT_VIEW("QUARTILE_95_PERCENT_VIEW"),
  
  VIDEO_10_S_VIEW("VIDEO_10S_VIEW"),
  
  VIDEO_START("VIDEO_START");

  private final String value;

  TopVideoPinsSortBy(String value) {
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
  public static TopVideoPinsSortBy fromValue(String value) {
    for (TopVideoPinsSortBy b : TopVideoPinsSortBy.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

