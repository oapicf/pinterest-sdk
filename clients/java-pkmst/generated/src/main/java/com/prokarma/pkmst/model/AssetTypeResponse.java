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
 * Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
 */
public enum AssetTypeResponse {
  
  AD_ACCOUNT("AD_ACCOUNT"),
  
  MERCHANT("MERCHANT"),
  
  PROFILE("PROFILE"),
  
  ASSET_GROUP("ASSET_GROUP"),
  
  PINNER_LIST("PINNER_LIST"),
  
  CONVERSION_TAG("CONVERSION_TAG"),
  
  CATALOG("CATALOG"),
  
  CONVERSION_SEGMENT("CONVERSION_SEGMENT");

  private String value;

  AssetTypeResponse(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AssetTypeResponse fromValue(String text) {
    for (AssetTypeResponse b : AssetTypeResponse.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

