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
 * A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both.
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public enum PlacementTrafficType {
  
  ALL("ALL"),
  
  TWO_COLUMN_FEED("TWO_COLUMN_FEED"),
  
  FULLSCREEN_FEED("FULLSCREEN_FEED");

  private final String value;

  PlacementTrafficType(String value) {
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
  public static PlacementTrafficType fromValue(String value) {
    for (PlacementTrafficType b : PlacementTrafficType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

