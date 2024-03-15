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
 * Permission role for business access.
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-03-14T23:03:40.689435566Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public enum BusinessAccessRole {
  
  OWNER("OWNER"),
  
  ADMIN("ADMIN"),
  
  ANALYST("ANALYST"),
  
  SOS_READER("SOS_READER"),
  
  FINANCE_MANAGER("FINANCE_MANAGER"),
  
  AUDIENCE_MANAGER("AUDIENCE_MANAGER"),
  
  CAMPAIGN_MANAGER("CAMPAIGN_MANAGER"),
  
  CATALOGS_MANAGER("CATALOGS_MANAGER"),
  
  RESTRICTED_OWNER("RESTRICTED_OWNER"),
  
  PROFILE_MANAGER("PROFILE_MANAGER"),
  
  PROFILE_PUBLISHER("PROFILE_PUBLISHER"),
  
  RESOURCE_PINNER_LIST_OWNER("RESOURCE_PINNER_LIST_OWNER"),
  
  RESOURCE_PINNER_LIST_READER("RESOURCE_PINNER_LIST_READER"),
  
  BIZ_PINNER_LIST_SHARER("BIZ_PINNER_LIST_SHARER"),
  
  RESOURCE_CONVERSION_TAGS_READER("RESOURCE_CONVERSION_TAGS_READER");

  private String value;

  BusinessAccessRole(String value) {
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
  public static BusinessAccessRole fromValue(String value) {
    for (BusinessAccessRole b : BusinessAccessRole.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

