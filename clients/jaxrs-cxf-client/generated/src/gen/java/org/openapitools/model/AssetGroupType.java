package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Asset group type
 */
public enum AssetGroupType {
  
  BRAND("BRAND"),
  
  LOCATION_OR_LANGUAGE("LOCATION_OR_LANGUAGE"),
  
  PRODUCT_LINE("PRODUCT_LINE"),
  
  OTHER("OTHER");

  private String value;

  AssetGroupType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AssetGroupType fromValue(String value) {
    for (AssetGroupType b : AssetGroupType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

