package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import java.math.BigDecimal;
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
 * Gets or Sets ProductCategoryDetailLookbackWindow
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public enum ProductCategoryDetailLookbackWindow {
  
  NUMBER_90(new BigDecimal("90")),
  
  NUMBER_180(new BigDecimal("180")),
  
  NUMBER_365(new BigDecimal("365")),
  
  NUMBER_730(new BigDecimal("730"));

  private final BigDecimal value;

  ProductCategoryDetailLookbackWindow(BigDecimal value) {
    this.value = value;
  }

  @JsonValue
  public BigDecimal getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ProductCategoryDetailLookbackWindow fromValue(BigDecimal value) {
    for (ProductCategoryDetailLookbackWindow b : ProductCategoryDetailLookbackWindow.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

