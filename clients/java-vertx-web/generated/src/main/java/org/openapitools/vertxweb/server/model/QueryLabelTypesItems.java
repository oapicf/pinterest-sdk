package org.openapitools.vertxweb.server.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets QueryLabelTypesItems
 */
public enum QueryLabelTypesItems {
  
  BRAND("BRAND"),
  
  CUSTOM("CUSTOM");

  private String value;

  QueryLabelTypesItems(String value) {
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

  public static QueryLabelTypesItems fromValue(String value) {
    for (QueryLabelTypesItems b : QueryLabelTypesItems.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}