package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * List of source platforms for a conversion event.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-31T05:12:58.482218752Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public enum SourcePlatformOptions {
  
  WEB("WEB"),
  
  MOBILE("MOBILE"),
  
  MOBILE_ANDROID("MOBILE_ANDROID"),
  
  MOBILE_IOS("MOBILE_IOS"),
  
  OFFLINE("OFFLINE"),
  
  PINTEREST_WEB("PINTEREST_WEB"),
  
  PINTEREST_ANDROID("PINTEREST_ANDROID"),
  
  PINTEREST_IOS("PINTEREST_IOS"),
  
  POINT_OF_SALE("POINT_OF_SALE");

  private final String value;

  SourcePlatformOptions(String value) {
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
  public static SourcePlatformOptions fromValue(String value) {
    for (SourcePlatformOptions b : SourcePlatformOptions.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

