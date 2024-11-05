package org.openapitools.model;



/**
 * Gets or Sets CatalogsFeedProcessingStatus
 */
public enum CatalogsFeedProcessingStatus {
  
  COMPLETED("COMPLETED"),
  
  FAILED("FAILED"),
  
  PROCESSING("PROCESSING");

  private String value;

  CatalogsFeedProcessingStatus(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CatalogsFeedProcessingStatus fromValue(String value) {
    for (CatalogsFeedProcessingStatus b : CatalogsFeedProcessingStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

