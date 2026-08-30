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
 * Disclosure label for AI-generated or AI-modified content in a catalog item asset.
 */
public enum CatalogsAiContentDisclosureLabel {
  
  AI_MODIFIED("ai_modified"),
  
  SYNTHETIC_PERFORMER("synthetic_performer");

  private String value;

  CatalogsAiContentDisclosureLabel(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CatalogsAiContentDisclosureLabel fromValue(String text) {
    for (CatalogsAiContentDisclosureLabel b : CatalogsAiContentDisclosureLabel.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

