package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * The name of field that businesses are sorted by
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

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

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static BusinessMemberSortBy fromValue(String text) {
    for (BusinessMemberSortBy b : BusinessMemberSortBy.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


