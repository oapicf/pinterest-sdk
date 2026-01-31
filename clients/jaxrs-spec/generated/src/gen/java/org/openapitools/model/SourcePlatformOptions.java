package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

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

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static SourcePlatformOptions fromString(String s) {
      for (SourcePlatformOptions b : SourcePlatformOptions.values()) {
        // using Objects.toString() to be safe if value type non-object type
        // because types like 'int' etc. will be auto-boxed
        if (java.util.Objects.toString(b.value).equals(s)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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


