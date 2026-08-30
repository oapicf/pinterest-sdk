package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * AI disclosure declaration the creator has made about the Pin.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * AI disclosure declaration the creator has made about the Pin.
 */
public enum AiDisclosureItem {
  
  AI_MODIFIED("AI_MODIFIED"),
  
  SYNTHETIC_PERFORMER("SYNTHETIC_PERFORMER");

  private String value;

  AiDisclosureItem(String value) {
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

  public static AiDisclosureItem fromValue(String value) {
    for (AiDisclosureItem b : AiDisclosureItem.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}