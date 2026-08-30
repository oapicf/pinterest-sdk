package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Operating system family.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

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

  private String value;

  OsFamily(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OsFamily fromValue(String value) {
    for (OsFamily b : OsFamily.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}