package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Platform options for AppsFlyer audience
 */
public enum AppsflyerPlatform {
  
  ANDROID("android"),
  
  IOS("ios");

  private final String value;

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

