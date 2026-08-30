@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class PlacementType {
    @JsonProperty(value = "SEARCH") SEARCH,
    @JsonProperty(value = "BROWSE") BROWSE,
    @JsonProperty(value = "RELATED_PINS") RELATED_PINS,
}
