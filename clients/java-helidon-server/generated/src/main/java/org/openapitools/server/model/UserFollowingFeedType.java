package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


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

