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
 * Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public enum AssetTypeResponse {
  
  AD_ACCOUNT("AD_ACCOUNT"),
  
  MERCHANT("MERCHANT"),
  
  PROFILE("PROFILE"),
  
  ASSET_GROUP("ASSET_GROUP"),
  
  PINNER_LIST("PINNER_LIST"),
  
  CONVERSION_TAG("CONVERSION_TAG"),
  
  CATALOG("CATALOG"),
  
  CONVERSION_SEGMENT("CONVERSION_SEGMENT");

  private final String value;

  AssetTypeResponse(String value) {
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
  public static AssetTypeResponse fromValue(String value) {
    for (AssetTypeResponse b : AssetTypeResponse.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

