package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * The field to sort member assets by
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The field to sort member assets by
 */
public enum AssetSortBy {
  
  NAME("NAME"),
  
  ID("ID"),
  
  PERMISSIONS("PERMISSIONS");

  private String value;

  AssetSortBy(String value) {
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

  public static AssetSortBy fromValue(String value) {
    for (AssetSortBy b : AssetSortBy.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}