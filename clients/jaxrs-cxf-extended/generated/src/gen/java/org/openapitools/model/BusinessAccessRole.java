package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Permission role for business access.
 */
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

  @Override
  @JsonValue
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

