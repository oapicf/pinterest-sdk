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
 * Attribution model used to attribute the conversion event.
 */
public enum AttributionModel {
  
  FIRST_TOUCH("first_touch"),
  
  LAST_TOUCH("last_touch"),
  
  MULTI_TOUCH("multi_touch"),
  
  MMM("mmm");

  private String value;

  AttributionModel(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AttributionModel fromValue(String text) {
    for (AttributionModel b : AttributionModel.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

