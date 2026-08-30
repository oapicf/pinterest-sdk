package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AssetTypeResponse fromValue(String value) {
    for (AssetTypeResponse b : AssetTypeResponse.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}