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
 * Permission levels available on a business asset.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public enum Permissions {
  
  ADMIN("ADMIN"),
  
  ANALYST("ANALYST"),
  
  FINANCE_MANAGER("FINANCE_MANAGER"),
  
  FINANCE_EDIT("FINANCE_EDIT"),
  
  FINANCE_VIEW("FINANCE_VIEW"),
  
  AUDIENCE_MANAGER("AUDIENCE_MANAGER"),
  
  CAMPAIGN_MANAGER("CAMPAIGN_MANAGER"),
  
  CATALOGS_MANAGER("CATALOGS_MANAGER"),
  
  CATALOGS_VIEWER("CATALOGS_VIEWER"),
  
  PROFILE_PUBLISHER("PROFILE_PUBLISHER"),
  
  CONSUMER_USER("CONSUMER_USER"),
  
  BIZ_PINNER_LIST_SHARER("BIZ_PINNER_LIST_SHARER");

  private final String value;

  Permissions(String value) {
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
  public static Permissions fromValue(String value) {
    for (Permissions b : Permissions.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

