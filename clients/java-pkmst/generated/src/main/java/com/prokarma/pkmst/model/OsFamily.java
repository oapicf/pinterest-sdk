package com.prokarma.pkmst.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
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

  private String value;

  OsFamily(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OsFamily fromValue(String text) {
    for (OsFamily b : OsFamily.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

