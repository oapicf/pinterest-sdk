package org.openapitools.vertxweb.server.model;

import java.util.Objects;

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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdgroupTrackingFeatureType fromValue(String value) {
    for (AdgroupTrackingFeatureType b : AdgroupTrackingFeatureType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}