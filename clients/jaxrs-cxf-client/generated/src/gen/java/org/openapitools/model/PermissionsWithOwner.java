package org.openapitools.model;



/**
 * Gets or Sets PermissionsWithOwner
 */
public enum PermissionsWithOwner {
  
  ADMIN("ADMIN"),
  
  ANALYST("ANALYST"),
  
  FINANCE_MANAGER("FINANCE_MANAGER"),
  
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
  public String toString() {
    return String.valueOf(value);
  }

  public static PermissionsWithOwner fromValue(String value) {
    for (PermissionsWithOwner b : PermissionsWithOwner.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

