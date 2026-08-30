@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class UserFollowingFeedType {
    @JsonProperty(value = "ALL") ALL,
    @JsonProperty(value = "RANKED") RANKED,
    @JsonProperty(value = "CREATOR_ONLY") CREATOR_ONLY,
    @JsonProperty(value = "RANKED_CREATOR_ONLY") RANKED_CREATOR_ONLY,
}
