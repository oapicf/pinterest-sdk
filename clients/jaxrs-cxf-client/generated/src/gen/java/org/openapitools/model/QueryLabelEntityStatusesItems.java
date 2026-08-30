package org.openapitools.model;



/**
 * Gets or Sets QueryLabelEntityStatusesItems
 */
public enum QueryLabelEntityStatusesItems {
  
  ACTIVE("ACTIVE"),
  
  ARCHIVED("ARCHIVED");

  private String value;

  QueryLabelEntityStatusesItems(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QueryLabelEntityStatusesItems fromValue(String value) {
    for (QueryLabelEntityStatusesItems b : QueryLabelEntityStatusesItems.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

