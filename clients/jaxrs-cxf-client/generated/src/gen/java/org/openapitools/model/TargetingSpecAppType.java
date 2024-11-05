package org.openapitools.model;



/**
 * Gets or Sets TargetingSpecAppType
 */
public enum TargetingSpecAppType {
  
  ANDROID_MOBILE("android_mobile"),
  
  ANDROID_TABLET("android_tablet"),
  
  IPAD("ipad"),
  
  IPHONE("iphone"),
  
  WEB("web"),
  
  WEB_MOBILE("web_mobile");

  private String value;

  TargetingSpecAppType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TargetingSpecAppType fromValue(String value) {
    for (TargetingSpecAppType b : TargetingSpecAppType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

