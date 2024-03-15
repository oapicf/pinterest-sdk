package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum UserFollowingFeedType {

    ALL("ALL"),
    
    RANKED("RANKED"),
    
    CREATOR_ONLY("CREATOR_ONLY"),
    
    RANKED_CREATOR_ONLY("RANKED_CREATOR_ONLY")

    private final String value

    UserFollowingFeedType(String value) {
        this.value = value
    }

    String getValue() {
        value
    }

    @Override
    String toString() {
        String.valueOf(value)
    }
}
