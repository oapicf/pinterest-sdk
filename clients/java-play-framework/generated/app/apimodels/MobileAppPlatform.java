package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Platform of the mobile app for an `APP_INSTALL` campaign.
 */
public enum MobileAppPlatform {
  
  IOS("IOS"),
  
  ANDROID("ANDROID");

  private final String value;

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

