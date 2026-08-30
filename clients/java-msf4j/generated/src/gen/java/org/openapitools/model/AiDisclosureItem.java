package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

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

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AiDisclosureItem fromValue(String text) {
    for (AiDisclosureItem b : AiDisclosureItem.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

