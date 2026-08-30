package org.openapitools.model;



/**
 * The type of an SSIO order line.
 */
public enum SSIOOrderLineType {
  
  BUDGET("BUDGET"),
  
  PERPETUALS("PERPETUALS");

  private String value;

  SSIOOrderLineType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SSIOOrderLineType fromValue(String value) {
    for (SSIOOrderLineType b : SSIOOrderLineType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

