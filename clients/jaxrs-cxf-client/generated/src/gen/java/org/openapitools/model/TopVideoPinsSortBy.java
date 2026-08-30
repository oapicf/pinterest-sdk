package org.openapitools.model;



/**
 * Sort metric for top video pins analytics.
 */
public enum TopVideoPinsSortBy {
  
  SAVE("SAVE"),
  
  IMPRESSION("IMPRESSION"),
  
  OUTBOUND_CLICK("OUTBOUND_CLICK"),
  
  VIDEO_MRC_VIEW("VIDEO_MRC_VIEW"),
  
  VIDEO_AVG_WATCH_TIME("VIDEO_AVG_WATCH_TIME"),
  
  VIDEO_V50_WATCH_TIME("VIDEO_V50_WATCH_TIME"),
  
  QUARTILE_95_PERCENT_VIEW("QUARTILE_95_PERCENT_VIEW"),
  
  VIDEO_10_S_VIEW("VIDEO_10S_VIEW"),
  
  VIDEO_START("VIDEO_START");

  private String value;

  TopVideoPinsSortBy(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TopVideoPinsSortBy fromValue(String value) {
    for (TopVideoPinsSortBy b : TopVideoPinsSortBy.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

