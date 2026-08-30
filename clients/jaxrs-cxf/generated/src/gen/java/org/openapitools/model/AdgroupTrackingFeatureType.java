package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets AdgroupTrackingFeatureType
 */
public enum AdgroupTrackingFeatureType {
  
  TRENDS("TRENDS"),
  
  CLONE_META("CLONE_META"),
  
  BULK_EDITOR("BULK_EDITOR"),
  
  AD_ROTATION("AD_ROTATION");

  private String value;

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

