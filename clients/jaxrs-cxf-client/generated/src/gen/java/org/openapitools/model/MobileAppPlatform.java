package org.openapitools.model;



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
  public String toString() {
    return String.valueOf(value);
  }

  public static MobileAppPlatform fromValue(String value) {
    for (MobileAppPlatform b : MobileAppPlatform.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

