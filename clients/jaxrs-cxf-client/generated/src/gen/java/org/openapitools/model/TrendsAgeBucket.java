package org.openapitools.model;



/**
 * Gets or Sets TrendsAgeBucket
 */
public enum TrendsAgeBucket {
  
  _18_24("18-24"),
  
  _25_34("25-34"),
  
  _35_44("35-44"),
  
  _45_49("45-49"),
  
  _50_54("50-54"),
  
  _55_64("55-64"),
  
  _65_("65+");

  private String value;

  TrendsAgeBucket(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TrendsAgeBucket fromValue(String value) {
    for (TrendsAgeBucket b : TrendsAgeBucket.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

