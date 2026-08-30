package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * The field to sort member assets by
 */
public enum AssetSortBy {
  
  NAME("NAME"),
  
  ID("ID"),
  
  PERMISSIONS("PERMISSIONS");

  private final String value;

  AssetSortBy(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AssetSortBy fromValue(String value) {
    for (AssetSortBy b : AssetSortBy.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

