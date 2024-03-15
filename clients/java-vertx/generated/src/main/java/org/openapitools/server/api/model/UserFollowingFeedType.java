package org.openapitools.server.api.model;

import java.util.Objects;

/**
 * Specifies the type of followees to be kept when filtering them.
 **/
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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static UserFollowingFeedType fromValue(String value) {
    for (UserFollowingFeedType b : UserFollowingFeedType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}