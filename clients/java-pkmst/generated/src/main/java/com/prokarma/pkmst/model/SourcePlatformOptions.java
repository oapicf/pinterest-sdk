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

  private String value;

  SourcePlatformOptions(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SourcePlatformOptions fromValue(String text) {
    for (SourcePlatformOptions b : SourcePlatformOptions.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

