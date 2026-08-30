package org.openapitools.model;



/**
 * The source of conversion events ingestion
 */
public enum CreationSource {
  
  ADS_API("ADS_API"),
  
  ADS_MANAGER_REPORTING_PAGE("ADS_MANAGER_REPORTING_PAGE"),
  
  ADS_MANAGER_REPORT_BUILDER("ADS_MANAGER_REPORT_BUILDER");

  private String value;

  CreationSource(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CreationSource fromValue(String value) {
    for (CreationSource b : CreationSource.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

