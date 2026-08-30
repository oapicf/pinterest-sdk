package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets AdPinPreviewCreativeType
 */
public enum AdPinPreviewCreativeType {
  
  SHOPPING("SHOPPING"),
  
  COLLECTION("COLLECTION"),
  
  MAX_VIDEO("MAX_VIDEO"),
  
  MAX_WIDTH_VIDEO_COLLECTION("MAX_WIDTH_VIDEO_COLLECTION"),
  
  MAX_WIDTH_REGULAR_COLLECTION("MAX_WIDTH_REGULAR_COLLECTION");

  private final String value;

  AdPinPreviewCreativeType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AdPinPreviewCreativeType fromValue(String value) {
    for (AdPinPreviewCreativeType b : AdPinPreviewCreativeType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

