package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Permission aggregation type for asset access
 */
public enum AssetPermissionType {
  
  AGGREGATED_PERMISSION("AGGREGATED_PERMISSION"),
  
  DIRECT_PERMISSION("DIRECT_PERMISSION");

  private final String value;

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

