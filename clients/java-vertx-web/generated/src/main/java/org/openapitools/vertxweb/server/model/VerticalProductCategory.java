package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * List of verticals for product categories.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * List of verticals for product categories.
 */
public enum VerticalProductCategory {
  
  FASHION("FASHION"),
  
  HOME_DECOR("HOME_DECOR"),
  
  BEAUTY("BEAUTY");

  private String value;

  VerticalProductCategory(String value) {
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

  public static VerticalProductCategory fromValue(String value) {
    for (VerticalProductCategory b : VerticalProductCategory.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}