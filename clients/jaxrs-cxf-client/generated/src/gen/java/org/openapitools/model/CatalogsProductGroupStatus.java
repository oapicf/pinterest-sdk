package org.openapitools.model;



/**
 * Gets or Sets CatalogsProductGroupStatus
 */
public enum CatalogsProductGroupStatus {
  
  ACTIVE("ACTIVE"),
  
  INACTIVE("INACTIVE");

  private String value;

  CatalogsProductGroupStatus(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CatalogsProductGroupStatus fromValue(String value) {
    for (CatalogsProductGroupStatus b : CatalogsProductGroupStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

