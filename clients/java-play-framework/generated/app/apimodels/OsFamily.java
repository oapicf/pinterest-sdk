package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Operating system family.
 */
public enum OsFamily {
  
  IOS("ios"),
  
  ANDROID("android"),
  
  MACOS("macos"),
  
  WINDOWS("windows"),
  
  LINUX("linux"),
  
  BSD("bsd"),
  
  OTHER("other");

  private final String value;

  OsFamily(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OsFamily fromValue(String value) {
    for (OsFamily b : OsFamily.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

