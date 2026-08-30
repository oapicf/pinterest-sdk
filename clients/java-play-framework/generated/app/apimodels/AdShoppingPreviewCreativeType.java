package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets AdShoppingPreviewCreativeType
 */
public enum AdShoppingPreviewCreativeType {
  
  SHOPPING("SHOPPING"),
  
  COLLECTION("COLLECTION"),
  
  CAROUSEL("CAROUSEL"),
  
  MAX_WIDTH_COLLECTION("MAX_WIDTH_COLLECTION");

  private final String value;

  AdShoppingPreviewCreativeType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AdShoppingPreviewCreativeType fromValue(String value) {
    for (AdShoppingPreviewCreativeType b : AdShoppingPreviewCreativeType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

