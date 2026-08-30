package org.openapitools.model;



/**
 * Attribution model used to attribute the conversion event.
 */
public enum AttributionModel {
  
  FIRST_TOUCH("first_touch"),
  
  LAST_TOUCH("last_touch"),
  
  MULTI_TOUCH("multi_touch"),
  
  MMM("mmm");

  private String value;

  AttributionModel(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AttributionModel fromValue(String value) {
    for (AttributionModel b : AttributionModel.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

