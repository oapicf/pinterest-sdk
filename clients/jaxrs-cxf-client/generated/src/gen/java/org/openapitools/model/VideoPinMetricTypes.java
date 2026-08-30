package org.openapitools.model;



/**
 * Video Pin metric types
 */
public enum VideoPinMetricTypes {
  
  IMPRESSION("IMPRESSION"),
  
  OUTBOUND_CLICK("OUTBOUND_CLICK"),
  
  PIN_CLICK("PIN_CLICK"),
  
  SAVE("SAVE"),
  
  SAVE_RATE("SAVE_RATE"),
  
  VIDEO_MRC_VIEW("VIDEO_MRC_VIEW"),
  
  VIDEO_10_S_VIEW("VIDEO_10S_VIEW"),
  
  QUARTILE_95_PERCENT_VIEW("QUARTILE_95_PERCENT_VIEW"),
  
  VIDEO_V50_WATCH_TIME("VIDEO_V50_WATCH_TIME"),
  
  VIDEO_START("VIDEO_START"),
  
  VIDEO_AVG_WATCH_TIME("VIDEO_AVG_WATCH_TIME"),
  
  TOTAL_COMMENTS("TOTAL_COMMENTS"),
  
  TOTAL_REACTIONS("TOTAL_REACTIONS");

  private String value;

  VideoPinMetricTypes(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static VideoPinMetricTypes fromValue(String value) {
    for (VideoPinMetricTypes b : VideoPinMetricTypes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

