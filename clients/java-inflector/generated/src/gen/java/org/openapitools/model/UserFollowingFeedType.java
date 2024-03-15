package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Specifies the type of followees to be kept when filtering them.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

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
  public static UserFollowingFeedType fromValue(String text) {
    for (UserFollowingFeedType b : UserFollowingFeedType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


