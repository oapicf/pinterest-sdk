package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

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

  private final String value;

  TargetingSpecAppType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TargetingSpecAppType fromValue(String value) {
    for (TargetingSpecAppType b : TargetingSpecAppType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

