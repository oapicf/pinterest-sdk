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
 * Gets or Sets ConversionProductReportBreakdownType
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public enum ConversionProductReportBreakdownType {
  
  PRODUCT_BRAND("PRODUCT_BRAND"),
  
  PRODUCT_CATEGORY("PRODUCT_CATEGORY"),
  
  PRODUCT_BRAND_AND_CATEGORY("PRODUCT_BRAND_AND_CATEGORY"),
  
  PRODUCT_SKU("PRODUCT_SKU"),
  
  PRODUCT_SKU_GROUP("PRODUCT_SKU_GROUP");

  private final String value;

  ConversionProductReportBreakdownType(String value) {
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
  public static ConversionProductReportBreakdownType fromValue(String value) {
    for (ConversionProductReportBreakdownType b : ConversionProductReportBreakdownType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

