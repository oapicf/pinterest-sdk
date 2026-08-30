package org.openapitools.model;



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

