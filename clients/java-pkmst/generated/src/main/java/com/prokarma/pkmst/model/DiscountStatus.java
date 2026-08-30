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
 * Discount status based on the current time and start and end time of discount
 */
public enum DiscountStatus {
  
  OTHER("OTHER"),
  
  ACTIVE("ACTIVE"),
  
  PAUSED("PAUSED"),
  
  SCHEDULED("SCHEDULED"),
  
  EXPIRED("EXPIRED");

  private String value;

  DiscountStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static DiscountStatus fromValue(String text) {
    for (DiscountStatus b : DiscountStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

