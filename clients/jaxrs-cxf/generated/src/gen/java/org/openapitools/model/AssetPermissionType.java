package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

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

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AssetPermissionType fromValue(String value) {
    for (AssetPermissionType b : AssetPermissionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

