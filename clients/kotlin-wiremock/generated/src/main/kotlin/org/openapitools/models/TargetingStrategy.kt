@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class TargetingStrategy {
    @JsonProperty(value = "CHOOSE_YOUR_OWN") CHOOSE_YOUR_OWN,
    @JsonProperty(value = "FIND_NEW_CUSTOMERS") FIND_NEW_CUSTOMERS,
    @JsonProperty(value = "RECONNECT_WITH_USERS") RECONNECT_WITH_USERS,
}
