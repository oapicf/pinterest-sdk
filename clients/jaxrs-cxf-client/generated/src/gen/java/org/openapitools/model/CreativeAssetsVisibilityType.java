package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Creative assets visibility.
 */
public enum CreativeAssetsVisibilityType {
  
  VISIBLE("VISIBLE"),
  
  HIDDEN("HIDDEN");

  private String value;

  CreativeAssetsVisibilityType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CreativeAssetsVisibilityType fromValue(String value) {
    for (CreativeAssetsVisibilityType b : CreativeAssetsVisibilityType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

