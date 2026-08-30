package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Platform of the mobile app for an &#x60;APP_INSTALL&#x60; campaign.
 */
public enum MobileAppPlatform {
  
  IOS("IOS"),
  
  ANDROID("ANDROID");

  private String value;

  MobileAppPlatform(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static MobileAppPlatform fromValue(String value) {
    for (MobileAppPlatform b : MobileAppPlatform.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

