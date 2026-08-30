package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Platform of the mobile app for an &#x60;APP_INSTALL&#x60; campaign.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Platform of the mobile app for an `APP_INSTALL` campaign.
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
  public static MobileAppPlatform fromValue(String text) {
    for (MobileAppPlatform b : MobileAppPlatform.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


