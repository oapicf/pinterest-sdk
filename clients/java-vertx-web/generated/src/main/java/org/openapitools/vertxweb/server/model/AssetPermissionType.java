package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Permission aggregation type for asset access
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AssetPermissionType fromValue(String value) {
    for (AssetPermissionType b : AssetPermissionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}