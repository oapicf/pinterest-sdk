package org.openapitools.model;



/**
 * Reporting template type
 */
public enum MetricsReportingTemplateType {
  
  UNSPECIFIED("UNSPECIFIED"),
  
  BULK("BULK"),
  
  OVERVIEW("OVERVIEW"),
  
  TABLE("TABLE"),
  
  MMM("MMM"),
  
  BRAND_CATEGORY("BRAND_CATEGORY");

  private String value;

  MetricsReportingTemplateType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MetricsReportingTemplateType fromValue(String value) {
    for (MetricsReportingTemplateType b : MetricsReportingTemplateType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

