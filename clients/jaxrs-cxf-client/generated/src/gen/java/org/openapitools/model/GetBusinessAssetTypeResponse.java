package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Type of asset.
 */
public enum GetBusinessAssetTypeResponse {
  
  AD_ACCOUNT("AD_ACCOUNT"),
  
  PROFILE("PROFILE"),
  
  ASSET_GROUP("ASSET_GROUP"),
  
  CONVERSION_TAG("CONVERSION_TAG");

  private String value;

  GetBusinessAssetTypeResponse(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static GetBusinessAssetTypeResponse fromValue(String value) {
    for (GetBusinessAssetTypeResponse b : GetBusinessAssetTypeResponse.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

