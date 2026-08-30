package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Platform options for AppsFlyer audience
 */
public enum AppsflyerPlatform {
  
  ANDROID("android"),
  
  IOS("ios");

  private String value;

  AppsflyerPlatform(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AppsflyerPlatform fromValue(String value) {
    for (AppsflyerPlatform b : AppsflyerPlatform.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

