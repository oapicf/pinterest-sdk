package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * List of source platforms for a conversion event.
 */
public enum SourcePlatformOptions {
  
  WEB("WEB"),
  
  MOBILE("MOBILE"),
  
  MOBILE_ANDROID("MOBILE_ANDROID"),
  
  MOBILE_IOS("MOBILE_IOS"),
  
  OFFLINE("OFFLINE"),
  
  PINTEREST_WEB("PINTEREST_WEB"),
  
  PINTEREST_ANDROID("PINTEREST_ANDROID"),
  
  PINTEREST_IOS("PINTEREST_IOS"),
  
  POINT_OF_SALE("POINT_OF_SALE");

  private final String value;

  SourcePlatformOptions(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SourcePlatformOptions fromValue(String value) {
    for (SourcePlatformOptions b : SourcePlatformOptions.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

