package org.openapitools.model;



/**
 * Gets or Sets QuerymetrictypesItems
 */
public enum QuerymetrictypesItems {
  
  ENGAGEMENT("ENGAGEMENT"),
  
  ENGAGEMENT_RATE("ENGAGEMENT_RATE"),
  
  IMPRESSION("IMPRESSION"),
  
  OUTBOUND_CLICK("OUTBOUND_CLICK"),
  
  OUTBOUND_CLICK_RATE("OUTBOUND_CLICK_RATE"),
  
  PIN_CLICK("PIN_CLICK"),
  
  PIN_CLICK_RATE("PIN_CLICK_RATE"),
  
  SAVE("SAVE"),
  
  SAVE_RATE("SAVE_RATE");

  private String value;

  QuerymetrictypesItems(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QuerymetrictypesItems fromValue(String value) {
    for (QuerymetrictypesItems b : QuerymetrictypesItems.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

