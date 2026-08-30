package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * The name of field that businesses are sorted by
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The name of field that businesses are sorted by
 */
public enum BusinessMemberSortBy {
  
  FULL_NAME("FULL_NAME"),
  
  BUSINESS_ROLES("BUSINESS_ROLES"),
  
  CREATED_TIME("CREATED_TIME");

  private String value;

  BusinessMemberSortBy(String value) {
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

  public static BusinessMemberSortBy fromValue(String value) {
    for (BusinessMemberSortBy b : BusinessMemberSortBy.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}