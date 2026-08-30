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
 * Match type for an attributed event. P for probabilistic, D for deterministic, NA for Not applicable.
 */
public enum AttributionMatchType {
  
  P("P"),
  
  D("D"),
  
  NA("NA");

  private String value;

  AttributionMatchType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AttributionMatchType fromValue(String text) {
    for (AttributionMatchType b : AttributionMatchType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

