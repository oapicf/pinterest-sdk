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
 * Category for the labeled items. You can apply one BRAND label to a campaign. You can apply 30 CUSTOM labels to a campaign.
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public enum NullableLabelType {
  
  BRAND("BRAND"),
  
  CUSTOM("CUSTOM");

  private final String value;

  NullableLabelType(String value) {
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
  public static NullableLabelType fromValue(String value) {
    for (NullableLabelType b : NullableLabelType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

