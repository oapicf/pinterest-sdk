package org.openapitools.model;



/**
 * Intended result of the campaign. You can only update objectives for draft campaigns. &#x60;WEB_SESSIONS&#x60; and &#x60;VIDEO_VIEW&#x60; objectives are deprecated. We recommend using &#x60;VIDEO_COMPLETION&#x60; as an alternative for the latter.
 */
public enum BidFloorObjectiveType {
  
  AWARENESS("AWARENESS"),
  
  CONSIDERATION("CONSIDERATION"),
  
  WEB_CONVERSION("WEB_CONVERSION"),
  
  CATALOG_SALES("CATALOG_SALES"),
  
  VIDEO_COMPLETION("VIDEO_COMPLETION"),
  
  SALES("SALES");

  private String value;

  BidFloorObjectiveType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BidFloorObjectiveType fromValue(String value) {
    for (BidFloorObjectiveType b : BidFloorObjectiveType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

