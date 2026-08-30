package org.openapitools.model;



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

