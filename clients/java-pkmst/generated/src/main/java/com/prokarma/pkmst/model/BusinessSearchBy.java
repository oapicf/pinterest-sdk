package com.prokarma.pkmst.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
import com.fasterxml.jackson.annotation.JsonCreator;

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

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static BusinessSearchBy fromValue(String text) {
    for (BusinessSearchBy b : BusinessSearchBy.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

