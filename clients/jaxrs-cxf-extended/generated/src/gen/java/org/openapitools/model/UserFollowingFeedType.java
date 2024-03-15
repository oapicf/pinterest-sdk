package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Specifies the type of followees to be kept when filtering them.
 */
public enum UserFollowingFeedType {
  
  ALL("ALL"),
  
  RANKED("RANKED"),
  
  CREATOR_ONLY("CREATOR_ONLY"),
  
  RANKED_CREATOR_ONLY("RANKED_CREATOR_ONLY");

  private String value;

  UserFollowingFeedType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static UserFollowingFeedType fromValue(String value) {
    for (UserFollowingFeedType b : UserFollowingFeedType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

