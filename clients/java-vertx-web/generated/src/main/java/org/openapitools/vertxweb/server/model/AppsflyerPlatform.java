package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Platform options for AppsFlyer audience
 **/
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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AppsflyerPlatform fromValue(String value) {
    for (AppsflyerPlatform b : AppsflyerPlatform.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}