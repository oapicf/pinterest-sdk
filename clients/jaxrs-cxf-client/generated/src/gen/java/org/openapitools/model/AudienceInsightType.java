package org.openapitools.model;



/**
 * Gets or Sets AudienceInsightType
 */
public enum AudienceInsightType {
  
  YOUR_TOTAL_AUDIENCE("YOUR_TOTAL_AUDIENCE"),
  
  YOUR_ENGAGED_AUDIENCE("YOUR_ENGAGED_AUDIENCE"),
  
  PINTEREST_TOTAL_AUDIENCE("PINTEREST_TOTAL_AUDIENCE");

  private String value;

  AudienceInsightType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AudienceInsightType fromValue(String value) {
    for (AudienceInsightType b : AudienceInsightType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

