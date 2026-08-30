package org.openapitools.vertxweb.server.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets QueryLabelEntityStatusesItems
 */
public enum QueryLabelEntityStatusesItems {
  
  ACTIVE("ACTIVE"),
  
  ARCHIVED("ARCHIVED");

  private String value;

  QueryLabelEntityStatusesItems(String value) {
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

  public static QueryLabelEntityStatusesItems fromValue(String value) {
    for (QueryLabelEntityStatusesItems b : QueryLabelEntityStatusesItems.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}