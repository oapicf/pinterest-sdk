package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Disclosure label for AI-generated or AI-modified content in a catalog item asset.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Disclosure label for AI-generated or AI-modified content in a catalog item asset.
 */
public enum CatalogsAiContentDisclosureLabel {
  
  AI_MODIFIED("ai_modified"),
  
  SYNTHETIC_PERFORMER("synthetic_performer");

  private String value;

  CatalogsAiContentDisclosureLabel(String value) {
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

  public static CatalogsAiContentDisclosureLabel fromValue(String value) {
    for (CatalogsAiContentDisclosureLabel b : CatalogsAiContentDisclosureLabel.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}