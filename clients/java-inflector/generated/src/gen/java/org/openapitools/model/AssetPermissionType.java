package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Permission aggregation type for asset access
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Permission aggregation type for asset access
 */
public enum AssetPermissionType {
  
  AGGREGATED_PERMISSION("AGGREGATED_PERMISSION"),
  
  DIRECT_PERMISSION("DIRECT_PERMISSION");

  private String value;

  AssetPermissionType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AssetPermissionType fromValue(String text) {
    for (AssetPermissionType b : AssetPermissionType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


