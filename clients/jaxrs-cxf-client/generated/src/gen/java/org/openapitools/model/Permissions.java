package org.openapitools.model;



/**
 * Gets or Sets Permissions
 */
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
  
  CONSUMER_USER("CONSUMER_USER");

  private String value;

  Permissions(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Permissions fromValue(String value) {
    for (Permissions b : Permissions.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

