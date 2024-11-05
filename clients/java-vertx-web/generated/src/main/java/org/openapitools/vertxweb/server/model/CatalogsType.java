package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Type of the catalog entity.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of the catalog entity.
 */
public enum CatalogsType {
  
  RETAIL("RETAIL"),
  
  HOTEL("HOTEL"),
  
  CREATIVE_ASSETS("CREATIVE_ASSETS");

  private String value;

  CatalogsType(String value) {
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

  public static CatalogsType fromValue(String value) {
    for (CatalogsType b : CatalogsType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}