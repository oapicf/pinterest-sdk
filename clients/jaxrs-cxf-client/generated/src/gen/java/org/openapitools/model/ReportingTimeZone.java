package org.openapitools.model;



/**
 * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/) Specify the timezone to be applied for the reporting.
 */
public enum ReportingTimeZone {
  
  PINTEREST_TIME_ZONE("PINTEREST_TIME_ZONE"),
  
  AD_ACCOUNT_TIME_ZONE("AD_ACCOUNT_TIME_ZONE");

  private String value;

  ReportingTimeZone(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportingTimeZone fromValue(String value) {
    for (ReportingTimeZone b : ReportingTimeZone.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

