package org.openapitools.model;



/**
 * Sort metric for top pins analytics.
 */
public enum TopPinsSortBy {
  
  ENGAGEMENT("ENGAGEMENT"),
  
  SAVE("SAVE"),
  
  IMPRESSION("IMPRESSION"),
  
  OUTBOUND_CLICK("OUTBOUND_CLICK"),
  
  PIN_CLICK("PIN_CLICK");

  private String value;

  TopPinsSortBy(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TopPinsSortBy fromValue(String value) {
    for (TopPinsSortBy b : TopPinsSortBy.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

