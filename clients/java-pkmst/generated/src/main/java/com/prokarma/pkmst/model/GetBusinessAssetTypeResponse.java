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
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static GetBusinessAssetTypeResponse fromValue(String text) {
    for (GetBusinessAssetTypeResponse b : GetBusinessAssetTypeResponse.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

