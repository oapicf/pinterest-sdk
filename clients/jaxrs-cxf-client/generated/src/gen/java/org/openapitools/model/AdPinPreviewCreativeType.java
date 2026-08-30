package org.openapitools.model;



/**
 * Gets or Sets AdPinPreviewCreativeType
 */
public enum AdPinPreviewCreativeType {
  
  SHOPPING("SHOPPING"),
  
  COLLECTION("COLLECTION"),
  
  MAX_VIDEO("MAX_VIDEO"),
  
  MAX_WIDTH_VIDEO_COLLECTION("MAX_WIDTH_VIDEO_COLLECTION"),
  
  MAX_WIDTH_REGULAR_COLLECTION("MAX_WIDTH_REGULAR_COLLECTION");

  private String value;

  AdPinPreviewCreativeType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdPinPreviewCreativeType fromValue(String value) {
    for (AdPinPreviewCreativeType b : AdPinPreviewCreativeType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

