package org.openapitools.model;



/**
 * Match type for an attributed event. P for probabilistic, D for deterministic, NA for Not applicable.
 */
public enum AttributionMatchType {
  
  P("P"),
  
  D("D"),
  
  NA("NA");

  private String value;

  AttributionMatchType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AttributionMatchType fromValue(String value) {
    for (AttributionMatchType b : AttributionMatchType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

