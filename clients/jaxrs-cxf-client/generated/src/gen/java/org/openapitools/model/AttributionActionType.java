package org.openapitools.model;



/**
 * Type of an attributed action.
 */
public enum AttributionActionType {
  
  VIEW("view"),
  
  CLICK("click");

  private String value;

  AttributionActionType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AttributionActionType fromValue(String value) {
    for (AttributionActionType b : AttributionActionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

