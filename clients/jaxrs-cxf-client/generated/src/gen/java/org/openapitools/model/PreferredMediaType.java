package org.openapitools.model;



/**
 * Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only.
 */
public enum PreferredMediaType {
  
  VIDEO("VIDEO"),
  
  IMAGE("IMAGE");

  private String value;

  PreferredMediaType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PreferredMediaType fromValue(String value) {
    for (PreferredMediaType b : PreferredMediaType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

}

