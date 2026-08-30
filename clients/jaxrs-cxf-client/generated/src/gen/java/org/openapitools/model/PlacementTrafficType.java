package org.openapitools.model;



/**
 * A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both.
 */
public enum PlacementTrafficType {
  
  ALL("ALL"),
  
  TWO_COLUMN_FEED("TWO_COLUMN_FEED"),
  
  FULLSCREEN_FEED("FULLSCREEN_FEED");

  private String value;

  PlacementTrafficType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PlacementTrafficType fromValue(String value) {
    for (PlacementTrafficType b : PlacementTrafficType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

}

