package org.openapitools.model;



/**
 * Gets or Sets UserAccountType
 */
public enum UserAccountType {
  
  PINNER("PINNER"),
  
  BUSINESS("BUSINESS");

  private String value;

  UserAccountType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static UserAccountType fromValue(String value) {
    for (UserAccountType b : UserAccountType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

