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
 * Reason why a product pin is ineligible for tagging.
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public enum IneligibleProductTagReason {
  
  PIN_MISSING("PIN_MISSING"),
  
  PIN_IS_PRIVATE("PIN_IS_PRIVATE"),
  
  PRODUCT_METADATA_MISSING("PRODUCT_METADATA_MISSING"),
  
  PIN_NOT_FROM_VERIFIED_DOMAIN("PIN_NOT_FROM_VERIFIED_DOMAIN"),
  
  PIN_NOT_FROM_SAME_USER_AS_HERO_PIN("PIN_NOT_FROM_SAME_USER_AS_HERO_PIN");

  private final String value;

  IneligibleProductTagReason(String value) {
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
  public static IneligibleProductTagReason fromValue(String value) {
    for (IneligibleProductTagReason b : IneligibleProductTagReason.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

