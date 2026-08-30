package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * The names of fields that business accounts are searched by
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The names of fields that business accounts are searched by
 */
public enum BusinessSearchBy {
  
  FULL_NAME("FULL_NAME"),
  
  USERNAME("USERNAME"),
  
  BUSINESS_ID("BUSINESS_ID"),
  
  EMAIL("EMAIL");

  private String value;

  BusinessSearchBy(String value) {
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

  public static BusinessSearchBy fromValue(String value) {
    for (BusinessSearchBy b : BusinessSearchBy.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}