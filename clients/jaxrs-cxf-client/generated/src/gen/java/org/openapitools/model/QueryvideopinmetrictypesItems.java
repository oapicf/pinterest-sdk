package org.openapitools.model;



/**
 * Gets or Sets QueryvideopinmetrictypesItems
 */
public enum QueryvideopinmetrictypesItems {
  
  IMPRESSION("IMPRESSION"),
  
  SAVE("SAVE"),
  
  VIDEO_MRC_VIEW("VIDEO_MRC_VIEW"),
  
  VIDEO_AVG_WATCH_TIME("VIDEO_AVG_WATCH_TIME"),
  
  VIDEO_V50_WATCH_TIME("VIDEO_V50_WATCH_TIME"),
  
  QUARTILE_95_PERCENT_VIEW("QUARTILE_95_PERCENT_VIEW"),
  
  VIDEO_10_S_VIEW("VIDEO_10S_VIEW"),
  
  VIDEO_START("VIDEO_START"),
  
  OUTBOUND_CLICK("OUTBOUND_CLICK");

  private String value;

  QueryvideopinmetrictypesItems(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QueryvideopinmetrictypesItems fromValue(String value) {
    for (QueryvideopinmetrictypesItems b : QueryvideopinmetrictypesItems.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

