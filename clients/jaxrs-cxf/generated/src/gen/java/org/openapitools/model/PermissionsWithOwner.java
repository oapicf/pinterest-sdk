package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Permission levels including the OWNER role.
 */
public enum PermissionsWithOwner {
  
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
  
  OWNER("OWNER");

  private String value;

  PermissionsWithOwner(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PermissionsWithOwner fromValue(String value) {
    for (PermissionsWithOwner b : PermissionsWithOwner.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

