package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

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

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static VerticalProductCategory fromValue(String text) {
    for (VerticalProductCategory b : VerticalProductCategory.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

