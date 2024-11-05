package org.openapitools.model;



/**
 * Gets or Sets AudienceAccountType
 */
public enum AudienceAccountType {
  
  AD_ACCOUNT("AD_ACCOUNT"),
  
  BUSINESS_ACCOUNT("BUSINESS_ACCOUNT");

  private String value;

  AudienceAccountType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AudienceAccountType fromValue(String value) {
    for (AudienceAccountType b : AudienceAccountType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

