package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both.
 */
public enum PlacementTrafficType {
  
  ALL("ALL"),
  
  TWO_COLUMN_FEED("TWO_COLUMN_FEED"),
  
  FULLSCREEN_FEED("FULLSCREEN_FEED");

  private final String value;

  PlacementTrafficType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PlacementTrafficType fromValue(String value) {
    for (PlacementTrafficType b : PlacementTrafficType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

