package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Disclosure label for AI-generated or AI-modified content in a catalog item asset.
 */
public enum CatalogsAiContentDisclosureLabel {
  
  AI_MODIFIED("ai_modified"),
  
  SYNTHETIC_PERFORMER("synthetic_performer");

  private final String value;

  CatalogsAiContentDisclosureLabel(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CatalogsAiContentDisclosureLabel fromValue(String value) {
    for (CatalogsAiContentDisclosureLabel b : CatalogsAiContentDisclosureLabel.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

