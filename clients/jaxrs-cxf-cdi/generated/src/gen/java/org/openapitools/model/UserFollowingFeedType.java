package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Specifies the type of followees to be kept when filtering them.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum UserFollowingFeedType {

    @JsonProperty("ALL") ALL(String.valueOf("ALL")), @JsonProperty("RANKED") RANKED(String.valueOf("RANKED")), @JsonProperty("CREATOR_ONLY") CREATOR_ONLY(String.valueOf("CREATOR_ONLY")), @JsonProperty("RANKED_CREATOR_ONLY") RANKED_CREATOR_ONLY(String.valueOf("RANKED_CREATOR_ONLY"));


    private String value;

    UserFollowingFeedType(String v) {
        value = v;
    }

    public String value() {
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



