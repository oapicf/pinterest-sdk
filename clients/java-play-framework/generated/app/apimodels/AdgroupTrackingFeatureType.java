package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets AdgroupTrackingFeatureType
 */
public enum AdgroupTrackingFeatureType {
  
  TRENDS("TRENDS"),
  
  CLONE_META("CLONE_META"),
  
  BULK_EDITOR("BULK_EDITOR"),
  
  AD_ROTATION("AD_ROTATION");

  private final String value;

  AdgroupTrackingFeatureType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AdgroupTrackingFeatureType fromValue(String value) {
    for (AdgroupTrackingFeatureType b : AdgroupTrackingFeatureType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

