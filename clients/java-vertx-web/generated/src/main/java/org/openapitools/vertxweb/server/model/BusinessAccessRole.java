package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Permission role for business access.
 **/
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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BusinessAccessRole fromValue(String value) {
    for (BusinessAccessRole b : BusinessAccessRole.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}