package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Type of asset.
 */
public enum GetBusinessAssetTypeResponse {
  
  AD_ACCOUNT("AD_ACCOUNT"),
  
  PROFILE("PROFILE"),
  
  ASSET_GROUP("ASSET_GROUP"),
  
  CONVERSION_TAG("CONVERSION_TAG");

  private final String value;

  GetBusinessAssetTypeResponse(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static GetBusinessAssetTypeResponse fromValue(String value) {
    for (GetBusinessAssetTypeResponse b : GetBusinessAssetTypeResponse.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

