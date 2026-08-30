package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Ad review status
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Ad review status
 */
public enum AdReviewStatus {
  
  OTHER("OTHER"),
  
  PENDING("PENDING"),
  
  REJECTED("REJECTED"),
  
  APPROVED("APPROVED");

  private String value;

  AdReviewStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AdReviewStatus fromValue(String text) {
    for (AdReviewStatus b : AdReviewStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


