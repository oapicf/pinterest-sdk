package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Method used to verify website ownership.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Method used to verify website ownership.
 */
public enum WebsiteVerificationMethod {
  
  FILENAME("FILENAME"),
  
  METATAG("METATAG"),
  
  DNSTXT("DNSTXT");

  private String value;

  WebsiteVerificationMethod(String value) {
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

  public static WebsiteVerificationMethod fromValue(String value) {
    for (WebsiteVerificationMethod b : WebsiteVerificationMethod.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}